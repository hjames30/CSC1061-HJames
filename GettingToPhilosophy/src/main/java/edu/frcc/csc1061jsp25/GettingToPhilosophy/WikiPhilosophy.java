package edu.frcc.csc1061jsp25.GettingToPhilosophy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiPhilosophy {
	final static List<String> visited = new ArrayList<String>();
	final static WikiFetcher wf = new WikiFetcher();

	/**
	 * Tests a conjecture about Wikipedia and Philosophy.
	 *
	 * https://en.wikipedia.org/wiki/Wikipedia:Getting_to_Philosophy
	 *
	 * 1. Clicking on the first non-parenthesized, non-italicized link 2. Ignoring
	 * external links, links to the current page, or red links 3. Stopping when
	 * reaching "Philosophy", a page with no links or a page that does not exist, or
	 * when a loop occurs
	 *
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String destination = "https://en.wikipedia.org/wiki/Philosophy";
		String source = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		testConjecture(destination, source, 20);
	}

	/**
	 * Starts from given URL and follows first link until it finds the destination
	 * or exceeds the limit.
	 *
	 * @param destination
	 * @param source
	 * @throws IOException
	 */
	public static void testConjecture(String destination, String source, int limit) throws IOException {
		System.out.println("Visting " + source + " limit:" + limit);
		if (limit <= 0) {
			System.out.println("limit reached");
			return;
		}
		if (visited.contains(source)) {
			System.out.println("Source is looping");
			return;
		}
		if (source.equals(destination)) {
			System.out.println("Destination reached!!!");
			return;
		}
		visited.add(source);
		Document doc = null;
		Connection conn = Jsoup.connect(source);
		try {
			doc = conn.get();
		} catch (Exception e) {
			System.out.println("Could not open page. Exiting...");
			e.printStackTrace();
			System.exit(-1);
		}
		// select the content text and pull out the paragraphs.
		Element content = doc.getElementById("mw-content-text");
		Elements paragraphs = content.select("p");
		// TODO: FILL THIS IN!
		// If this node is a text node make sure you are not within parentheses
		// either use stack or int num parentheses and inc and dec with open and close
		// parent
		// first character not a pound|| not empty ||null
		// If this node has a link you can get it by accessing the href attribute in the
		// node
		// If the link is not null and not an empty string and does not start with a #
		// sign
		// and is not within parentheses, follow the link recursively by calling
		// testConjecture()
		// until you reach your objective or run past the limit.
		// will have to call testConjecture with same deination diff source and limit--
		int inParentheses = 0;
		String firstLink = null;
		boolean linkFound = false;
		for (Element para : paragraphs) {
			List<Node> nodes = para.childNodes();
			for (Node node : nodes) {
				if (node instanceof TextNode) {
					String text = ((TextNode) node).text();
					for (char c : text.toCharArray()) {
						if (c == '(') {
							inParentheses++;
						} else if (c == ')') {
							inParentheses--;
						}
					}
				} else if (node instanceof Element) {
					Element element = (Element) node;
					String href = element.attr("href");
					if (href != null && !href.isEmpty() && !href.startsWith("#") && (inParentheses == 0)
							&& !element.tagName().equals("i") && !element.tagName().equals("em")) {
						if (href.startsWith("/wiki/")) {
							href = "https://en.wikipedia.org" + href;
						}
						firstLink = href;
						linkFound = true;
						break;
					}
				}
			}
			if (linkFound) {
				break;
			}

		}
		if (firstLink != null) {
			testConjecture(destination, firstLink, --limit);
		} else {
			System.out.println("No valid links found on page: " + source);
		}
	}
}


	import java.awt.*;
	import java.util.Arrays;
	import java.util.StringTokenizer;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.text.html.HTMLDocument.Iterator;
	public class FrameDemo extends Frame implements ActionListener
	{
	TextArea Text_Data1;
	TextArea Text_Data2;
	int num = 0;
	int count = 0;
	Label label1,label2,label3,label4,label5;
	Button b_cmp;
	public FrameDemo()
	{
	label1 = new Label("Raw_data1");
	add(label1);
	Text_Data1 = new TextArea();
	add(Text_Data1);
	label2 = new Label("Raw_Data2");
	add(label2);
	Text_Data2 = new TextArea();
	add(Text_Data2);
	b_cmp = new Button("Compare");
	add(b_cmp);
	label4 = new Label("Result will go here");
	add(label4);
	label3 = new Label();
	add(label3);
	label5 = new Label();
	add(label5);
	b_cmp.addActionListener(this);
	setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b_cmp)
	{
	String str1 = Text_Data1.getText();
	String str2 = Text_Data2.getText();
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	StringTokenizer stok = new StringTokenizer(str1);
	String tokens[] = new String[stok.countTokens()];
	for( int i=0; i<tokens.length; i++)
	{
	tokens[i] = stok.nextToken();
	}
	System.out.println("First Array:");
	for( int i=0; i<tokens.length; i++)
	{
	System.out.print(tokens[i]+" ,");
	}
	StringTokenizer stok1 = new StringTokenizer(str2);
	String token1[] = new String[stok1.countTokens()];
	for( int i=0; i<token1.length; i++)
	{
	token1[i] = stok1.nextToken();
	}
	System.out.println("\n");
	System.out.println("Second Array:");
	for(int i=0; i<token1.length; i++)
	{
	System.out.print(token1[i]+", ");
	}
	for(int i=0; i<tokens.length; i++)
	{
	for(int j=0; j<token1.length; j++)
	{
	if(tokens[i].equals(token1[j]))
	{
	count++;
	}
	}
	}
	System.out.println("\n");
	System.out.println("Count is:"+count);
	label3.setText(String.valueOf(count));
	}
	}
	public static void main(String[] args)
	{
	FrameDemo obj = new FrameDemo();
	obj.setVisible(true);
	obj.setSize(800, 500);
	obj.setTitle("Plagarism");
	}
	}

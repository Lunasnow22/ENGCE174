package Lab5.Lab5l11;

import java.util.Scanner;

class Document{
    protected String title;
    public Document(String title){
         this.title = title; 
    }
    public void displayDetails(){
        System.out.println("Document: " + this.title);
    } 
}

class TextDocument extends Document{
    private int wordCount;

    public TextDocument(String title, int wordCount){
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document{
    private int pageCount;
    public PDFDocument(String title, int pageCount){
        super(title);
        this.pageCount = pageCount;
    }
    
    public int getPageCount(){
        return pageCount;
    }

    @Override
    public void displayDetails(){
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Lab5l11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text title: ");
        String textTitle = scanner.nextLine();

        System.out.print("Enter Word count: ");
        int wordCount = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter PDF title: ");
        String pdfTitle = scanner.nextLine();

        System.out.print("Enter Page count: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Text title: ");
        String textTitle2 = scanner.nextLine();

        System.out.print("Enter Word count: ");
        int wordCount2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter PDF title: ");
        String pdfTitle2 = scanner.nextLine();

        System.out.print("Enter Page count: ");
        int pageCount2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("---------------------------------------");

        TextDocument textDoc1 = new TextDocument(textTitle, wordCount);
        PDFDocument pdfDoc1 = new PDFDocument(pdfTitle, pageCount);
        TextDocument textDoc2 = new TextDocument(textTitle2, wordCount2);
        PDFDocument pdfDoc2 = new PDFDocument(pdfTitle2, pageCount2);

        Document[] documents = new Document[4];

        documents[0] = textDoc1;
        documents[1] = pdfDoc1;
        documents[2] = textDoc2;
        documents[3] = pdfDoc2;

        int totalpages = 0;

        for(Document d : documents){
            d.displayDetails();
            
            if(d instanceof PDFDocument){
                PDFDocument pdf = (PDFDocument) d;
                totalpages += pdf.getPageCount();
            }
        }
        
        System.out.println("Total Pages: " + totalpages);
        
        scanner.close();
    }
}

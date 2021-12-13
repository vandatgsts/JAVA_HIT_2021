package B3;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    private int id;
    private String title,publishDate,author,content;
    private float averageRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Dispay() {
        System.out.println("Tile: " +title  + "\tpublish Date: "+ publishDate + "\tauthor: " + author +"\tcontent: " + content +"\taverage Rate: "+ averageRate);
    }
    ArrayList<Integer> rateList=new ArrayList<Integer>();
    public void Calculate()
    {
        int sum=0;
        for(int i=0;i<rateList.size();i++)
            sum+=rateList.get(i);
        this.averageRate= (float) sum/3;
    }
    public void InputRateList()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            int  x;
            x=sc.nextInt();
            rateList.add(x);
        }
    }
}

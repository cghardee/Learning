package com.company;
import java.util.*;
/**
 * Created by htek on 6/11/2017.
 */

public class Human {
    private String Name;
    private Integer Age;
    private Integer Weight;
    private Integer Height;

    private List<String> details = new ArrayList<String>();


    public void setName(String Name){
        String personName = Name;
    }

    public void setAge(Integer Age){
        Integer personAge = Age;
    }

    public void setWeight(Integer Weight){
        Integer personWeight = Weight;
    }

    public void setHeight(Integer Height){
        Integer personHeight = Height;
    }

    public void addDetailsToArray(String Name, Integer Age, Integer Weight, Integer Height){
        List<String> myDetails = details;

        String toStringAge = Age.toString();
        String toStringWeight = Weight.toString();
        String toStringHeight = Height.toString();

        //Pull in the info for the name
        setName(Name);
        myDetails.add(Name);

        //Pull in the info for Age
        setAge(Age);
        myDetails.add(toStringAge);

        //Pull in the info for Weight
        setWeight(Weight);
        myDetails.add(toStringWeight);

        //Pull in the info for Height
        setHeight(Height);
        myDetails.add(toStringHeight);

    }

    public int getHeight(){
        return Height;
    }

    public int getAge(){
        return Age;
    }
    public int getWeight(){
        return Weight;
    }
    public void getDetailsFromArray(){

        String tellNameStatement = "Your Name is: ";
        String tellAgeStatement = "Your Age is: ";
        String tellWeightStatement = "Your Weight is: ";
        String tellHeightStatement = "Your Height is: ";

        System.out.print(tellNameStatement + details.get(0) + ". \n");
        System.out.print(tellAgeStatement + details.get(1) + " years old. \n");
        System.out.print(tellHeightStatement + details.get(2) + " inches. \n");
        System.out.print(tellWeightStatement+ details.get(3) + " pounds. \n");
    }

}

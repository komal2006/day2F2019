package com.lambton;



public class Student
{
    private int pass_marks=50;
    private int studentID;
    private String firstName;
    private String lastName;
    private int marksSub1;
    private int marksSub2;
    private int marksSub3;
    private int marksSub4;
    private int marksSub5;
    private int total;
    private float percentage;
    private String result;

    public int getStudentID()
    {

        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getfullName()
    {
        return firstName + " " + lastName;
    }

    public int getMarksSub1()
    {
        return marksSub1;
    }

    public void setMarksSub1(int marksSub1)
    {
        this.marksSub1 = marksSub1;
    }

    public int getMarksSub2()
    {
        return marksSub2;
    }

    public void setMarksSub2(int marksSub2)
    {
        this.marksSub2 = marksSub2;
    }

    public int getMarksSub3()
    {
        return marksSub3;
    }

    public void setMarksSub3(int marksSub3)
    {
        this.marksSub3 = marksSub3;
    }

    public int getMarksSub4()
    {
        return marksSub4;
    }

    public void setMarksSub4(int marksSub4)
    {
        this.marksSub4 = marksSub4;
    }

    public int getMarksSub5()
    {
        return marksSub5;
    }

    public void setMarksSub5(int marksSub5)
    {
        this.marksSub5 = marksSub5;
    }
    public int getTotal()
    {
        return total;
    }
    public float getpercentage()
    {
        return percentage;
    }

    public String getresult()
    {
        return result;
    }
    public void calculatetotal()
    {
        total=marksSub1 + marksSub2 + marksSub3 + marksSub4 + marksSub5;
    }
    public void calculatepercentage()
    {
        percentage = total / 5*100;
    }
    public void generateresult()
    {
       if (determineresult())
        {
           System.out.println("PASS");
        }
       else
       {
           System.out.println("FAIL");
       }
    }
    private boolean determineresult()
    {
        int count=0;
        if(marksSub1 < pass_marks)
        {
            count++;
        }
        if(marksSub2 < pass_marks)
        {
            count++;
        }
        if(marksSub3 < pass_marks)
        {
        count++;
        }

        if(marksSub4 < pass_marks)
        {
            count++;
        }
        if(marksSub5 < pass_marks)
        {
            count++;
        }
        if(count>=2)
        {
            return false;
        }
        return true;
    }
    public String calculateGrade()
    {
        String result;
        if(percentage<=49)
        {
            result="E";
        }
        else if(percentage<=59)
        {
            result="D";
        }
        else if(percentage<=69)
        {
            result="C";
        }
        else if(percentage<=79)
        {
            result="B";
        }
        else if(percentage<=89)
        {
            result="B+";
        }

        else if(percentage<=95)
        {
            result="A";
        }
        else
        {
            result="A+";
        }
         return result;
    }

}

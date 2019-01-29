package com.company;

public class Triangle
{
    int sideA;
    int sideB;
    int sideC;

    public int getPerimeter()
    {
        int perimeter = sideA + sideB + sideC;

        return perimeter;
    }

    public boolean isEquilateral()
    {
        boolean isEquilateral = false;

        if (sideA == sideB && sideB == sideC)
        {
            isEquilateral = true;
        }

        return isEquilateral;
    }

    public boolean isIsosceles()
    {
        boolean isIsosceles = false;

        if (!isEquilateral())
        {
            if (sideA == sideB || sideB == sideC || sideA == sideC)
            {
                isIsosceles = true;
            }
        }

        return isIsosceles;
    }

    public boolean isScalene()
    {
        boolean isScalene = false;

        if (sideA != sideB && sideB != sideC && sideA != sideC)
        {
            isScalene = true;
        }

        return isScalene;
    }

    public boolean isRightAngle()
    {
        boolean isRightAngle = false;

        if (sideA * sideA + sideB * sideB == sideC * sideC)
        {
            isRightAngle = true;
        }

        return isRightAngle;
    }

    public boolean isAcute()
    {
        boolean isAcute = false;

        if (sideA * sideA + sideB * sideB > sideC * sideC)
        {
            isAcute = true;
        }

        return isAcute;
    }

    public boolean isObtuse()
    {
        boolean isObtuse = false;

        if (sideA * sideA + sideB * sideB < sideC * sideC)
        {
            isObtuse = true;
        }

        return isObtuse;
    }


}

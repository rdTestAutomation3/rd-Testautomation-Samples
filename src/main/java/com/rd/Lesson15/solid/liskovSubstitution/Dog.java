package com.rd.Lesson15.solid.liskovSubstitution;

class Dog extends Animal
{
    @Override
    public void MakeSound()
    {
        System.out.println("Dog is barking.");
    }
}

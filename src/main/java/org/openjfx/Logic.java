package org.openjfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logic
{
    public static List<Parcours> readText(String text)
    {
        String el[]=text.split("\n");
        final String[] dims=(el[0]).split(" ");
        int i=1;
        List<Parcours> r=new ArrayList();
        try{

            while (i<el.length-1)
            {
                String ipos[]=el[i].split(" ");
                List<String> steps= Arrays.asList(el[i+1].split(""));
                Parcours cur=new Parcours(Integer.parseInt(ipos[0]), Integer.parseInt(ipos[1]), ipos[2],
                        steps,
                        Integer.parseInt(dims[0]),Integer.parseInt(dims[1]));
                r.add(cur);
                i+=2;
            }
        }
        catch(Exception e)
        {
            System.out.println("erreur dans le format du fichier");
            return null;
        }
        return r;
    }

    public static String resolve(String text)
    {

        List<Parcours> parcours=readText(text);
        String r="";
        for(Parcours p:parcours)
        {
            r+=p.resolve()+"\n";
        }
        return r;
    }

}
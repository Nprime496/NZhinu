package org.openjfx;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.fxml.FXML;

public class Parcours
{
    public int ipositionx;
    private final int ipositiony;
    private final String iorientation;
    List<String> steps;
    private final int maxpositionx;
    private final int maxpositiony;

    public  static final List<String> ORIENTATIONS= Arrays.asList("N","E","S","W");

    Parcours(int ipositionx, int ipositiony, String iorientation, List<String> steps, int maxpositionx, int maxpositiony) {
        this.ipositionx=ipositionx;
        this.ipositiony=ipositiony;
        this.iorientation=iorientation;
        this.steps=steps;
        this.maxpositionx=maxpositionx;
        this.maxpositiony=maxpositiony;

    }

    public String resolve()
    {
        int positionx=this.ipositionx;
        int positiony=this.ipositiony;
        int curorientation=ORIENTATIONS.indexOf(iorientation);
        for(String step:steps)
        {
            if(step.equals("A"))
            {
                if(ORIENTATIONS.get(curorientation).equals("N") && positiony<maxpositiony)
                {
                    positiony++;
                }
                else if (ORIENTATIONS.get(curorientation).equals("S") && positiony>0)
                {
                    positiony--;
                }
                else if(ORIENTATIONS.get(curorientation).equals("E") && positionx<maxpositionx)
                {
                    positionx++;
                }
                else if (ORIENTATIONS.get(curorientation).equals("W") && positionx>0)
                {
                    positionx--;
                }
            }
            else{
                if(step.equals("D"))
                {
                    curorientation=(curorientation+1)%4;
                }
                else//G
                {
                    curorientation=((curorientation-1)%4+4)%4;
                }
            }
        }

        return positionx+" "+positiony+" "+ORIENTATIONS.get(curorientation);
    }

}
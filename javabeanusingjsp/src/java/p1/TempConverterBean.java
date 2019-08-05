/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class TempConverterBean implements Serializable {
    private Integer celsius = 0;
    private Integer fahreinheit = 0;
    public TempConverterBean()
    {
        
    }
    public Integer getFahreinheit()
    {
        fahreinheit = (9*celsius/5)+32;
        return fahreinheit;
    }
    public void setCelsius(Integer celsius)
    {
        this.celsius=celsius;
    }
}

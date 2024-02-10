package co.icesi.edu;

import co.icesi.edu.model.Billboard;
import co.icesi.edu.model.InfraestructureDeparment;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class InfraestructureTest extends TestCase {

    public InfraestructureDeparment scenarion1() throws Exception {
        InfraestructureDeparment ID= new InfraestructureDeparment();
        return ID;
    }

    @Test
    public void testCalculateAverageBase() throws Exception {
        InfraestructureDeparment id=scenarion1();
        assertEquals(0,id.calculateAverageBase());

    }
}
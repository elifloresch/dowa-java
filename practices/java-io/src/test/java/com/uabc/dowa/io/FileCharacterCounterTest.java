package com.uabc.dowa.io;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileCharacterCounterTest  {
    @Test
    public void testCountNumberOfCharacterInFile() throws Exception {
        assertEquals(0, FileCharacterCounter.countNumberOfOccurrencesInFile('x'));
        assertEquals(0, FileCharacterCounter.countNumberOfOccurrencesInFile('z'));

        assertEquals(0, FileCharacterCounter.countNumberOfOccurrencesInFile('2'));

        assertEquals(8, FileCharacterCounter.countNumberOfOccurrencesInFile(','));
        assertEquals(9, FileCharacterCounter.countNumberOfOccurrencesInFile('u'));
        assertEquals(31, FileCharacterCounter.countNumberOfOccurrencesInFile('a'));
        assertEquals(36, FileCharacterCounter.countNumberOfOccurrencesInFile('o'));

        assertEquals(52, FileCharacterCounter.countNumberOfOccurrencesInFile('e'));
        assertEquals(52, FileCharacterCounter.countNumberOfOccurrencesInFile('i'));
    }
}
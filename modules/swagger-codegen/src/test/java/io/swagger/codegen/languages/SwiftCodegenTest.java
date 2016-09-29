package io.swagger.codegen.languages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwiftCodegenTest {

    SwiftCodegen swiftCodegen = new SwiftCodegen();

    @Test
    public void shouldNotBreakCorrectName() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("EntryName"), "entryName");
    }

    @Test
    public void testSingleWordAllCaps() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("VALUE"), "value");
    }

    @Test
    public void testSingleWordLowercase() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("value"), "value");
    }

    @Test
    public void testAncronym() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("HD"), "hd");
    }

    @Test
    public void testAncronymNumber() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("HD_1080"), "hd1080");
    }

    @Test
    public void testCapitalsWithUnderscore() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("ENTRY_NAME"), "entryName");
    }

    @Test
    public void testCapitalsWithDash() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("ENTRY-NAME"), "entryName");
    }

    @Test
    public void testCapitalsWithSpace() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("ENTRY NAME"), "entryName");
    }

    @Test
    public void testLowercaseWithUnderscore() throws Exception {
        Assert.assertEquals(swiftCodegen.toSwiftyEnumName("entry_name"), "entryName");
    }

}
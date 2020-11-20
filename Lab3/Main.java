package com.company;

public class Main {

    public static void main(String[] args) {
        TextMan text = new TextMan("Sed metus leo, facilisis ac lorem tincidunt, varius facilisis ex. " +
                "Donec efficitur turpis nec metus ultrices, commodo" +
                " facilisis nunc cursus. Nulla vel odio a metus iaculis aliquam" +
                " et eu enim. Vivamus non urna risus." +
                " Donec nec odio luctus, ultricies nibh eu, fringilla quam." +
                " Nam tempus facilisis tortor in scelerisque. Aenean" +
                " quis mauris eu augue iaculis dapibus at vitae ligula. Fusce" +
                " vel tellus facilisis, sodales erat vitae, dapibus velit." +
                " Vivamus nulla quam, scelerisque non sem fermentum, porta" +
                " mollis ipsum. Suspendisse potenti. Cras elementum viverra lacus," +
                " consectetur congue augue molestie nec. Praesent faucibus vestibulum" +
                " risus ut ultrices. Nunc ornare nisi sit amet maximus" +
                " ullamcorper. Sed eget erat ut enim sollicitudin hendrerit.");

        text.NumSent();
        text.NumWords();
        text.NumLet();
        text.VowelsAndCons();
    }
}

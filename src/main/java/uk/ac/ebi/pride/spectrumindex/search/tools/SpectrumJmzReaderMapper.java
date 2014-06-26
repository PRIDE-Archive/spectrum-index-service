package uk.ac.ebi.pride.spectrumindex.search.tools;


import uk.ac.ebi.pride.spectrumindex.search.model.Spectrum;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
public class SpectrumJmzReaderMapper {


    public static uk.ac.ebi.pride.spectrumindex.search.model.Spectrum createSpectrum(String projectAccession, String assayAccession, uk.ac.ebi.pride.tools.jmzreader.model.Spectrum jmzReaderSpectrum) {
        Spectrum res = new Spectrum();

        res.setProjectAccession(projectAccession);
        res.setAssayAccession(assayAccession);


        return res;
    }
}

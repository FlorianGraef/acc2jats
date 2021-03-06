//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;

import javax.xml.bind.annotation.XmlRegistry;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ANALYSISImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ANALYSISSETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.AnalysisFileTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.AttributeTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ChildTaxonTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.EXPERIMENTImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.EXPERIMENTSETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.EntryImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.EntrySetImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.EntrySetTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.IdentifierTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.LibraryDescriptorTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.LibraryTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.LinkTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.NameTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.OrganismTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.PROJECTImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.PROJECTSETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ParentTaxonTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.PipelineTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.PlatformTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.PoolMemberTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ProcessingTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.PublicationTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.QualifiedNameTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ROOTImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.RUNImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.RUNSETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ReferenceAssemblyTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ReferenceSequenceTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SAMPLEImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SAMPLESETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.STUDYImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.STUDYSETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SUBMISSIONImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SUBMISSIONSETImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SampleDescriptorTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SequencingDirectivesTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.SpotDescriptorTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.TaxonSetImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.TaxonSetTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.URLTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.XRefTypeImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.XrefTypeImpl;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.ac.ebi.literature.data_citation.ena.jaxb_beans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static Void _useJAXBProperties = null;

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.ac.ebi.literature.data_citation.ena.jaxb_beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PROJECT }
     * 
     */
    public PROJECT createPROJECT() {
        return new PROJECTImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS }
     * 
     */
    public ANALYSIS createANALYSIS() {
        return new ANALYSISImpl();
    }

    /**
     * Create an instance of {@link RUN }
     * 
     */
    public RUN createRUN() {
        return new RUNImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION }
     * 
     */
    public SUBMISSION createSUBMISSION() {
        return new SUBMISSIONImpl();
    }

    /**
     * Create an instance of {@link EXPERIMENT }
     * 
     */
    public EXPERIMENT createEXPERIMENT() {
        return new EXPERIMENTImpl();
    }

    /**
     * Create an instance of {@link STUDY }
     * 
     */
    public STUDY createSTUDY() {
        return new STUDYImpl();
    }

    /**
     * Create an instance of {@link SAMPLE }
     * 
     */
    public SAMPLE createSAMPLE() {
        return new SAMPLEImpl();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new EntryImpl();
    }

    /**
     * Create an instance of {@link uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon }
     * 
     */
    public uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon createTaxon() {
        return new uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.TaxonImpl();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkTypeImpl();
    }

    /**
     * Create an instance of {@link PipelineType }
     * 
     */
    public PipelineType createPipelineType() {
        return new PipelineTypeImpl();
    }

    /**
     * Create an instance of {@link ReferenceSequenceType }
     * 
     */
    public ReferenceSequenceType createReferenceSequenceType() {
        return new ReferenceSequenceTypeImpl();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType }
     * 
     */
    public ReferenceAssemblyType createReferenceAssemblyType() {
        return new ReferenceAssemblyTypeImpl();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType.CUSTOM }
     * 
     */
    public ReferenceAssemblyType.CUSTOM createReferenceAssemblyTypeCUSTOM() {
        return new ReferenceAssemblyTypeImpl.CUSTOMImpl();
    }

    /**
     * Create an instance of {@link SampleDescriptorType }
     * 
     */
    public SampleDescriptorType createSampleDescriptorType() {
        return new SampleDescriptorTypeImpl();
    }

    /**
     * Create an instance of {@link ChildTaxonType }
     * 
     */
    public ChildTaxonType createChildTaxonType() {
        return new ChildTaxonTypeImpl();
    }

    /**
     * Create an instance of {@link PublicationType }
     * 
     */
    public PublicationType createPublicationType() {
        return new PublicationTypeImpl();
    }

    /**
     * Create an instance of {@link PublicationType.PUBLICATIONLINKS }
     * 
     */
    public PublicationType.PUBLICATIONLINKS createPublicationTypePUBLICATIONLINKS() {
        return new PublicationTypeImpl.PUBLICATIONLINKSImpl();
    }

    /**
     * Create an instance of {@link PublicationType.STRUCTUREDCITATION }
     * 
     */
    public PublicationType.STRUCTUREDCITATION createPublicationTypeSTRUCTUREDCITATION() {
        return new PublicationTypeImpl.STRUCTUREDCITATIONImpl();
    }

    /**
     * Create an instance of {@link ParentTaxonType }
     * 
     */
    public ParentTaxonType createParentTaxonType() {
        return new ParentTaxonTypeImpl();
    }

    /**
     * Create an instance of {@link PoolMemberType }
     * 
     */
    public PoolMemberType createPoolMemberType() {
        return new PoolMemberTypeImpl();
    }

    /**
     * Create an instance of {@link LibraryDescriptorType }
     * 
     */
    public LibraryDescriptorType createLibraryDescriptorType() {
        return new LibraryDescriptorTypeImpl();
    }

    /**
     * Create an instance of {@link LibraryDescriptorType.TARGETEDLOCI }
     * 
     */
    public LibraryDescriptorType.TARGETEDLOCI createLibraryDescriptorTypeTARGETEDLOCI() {
        return new LibraryDescriptorTypeImpl.TARGETEDLOCIImpl();
    }

    /**
     * Create an instance of {@link LibraryDescriptorType.LIBRARYLAYOUT }
     * 
     */
    public LibraryDescriptorType.LIBRARYLAYOUT createLibraryDescriptorTypeLIBRARYLAYOUT() {
        return new LibraryDescriptorTypeImpl.LIBRARYLAYOUTImpl();
    }

    /**
     * Create an instance of {@link Entry.Contig }
     * 
     */
    public Entry.Contig createEntryContig() {
        return new EntryImpl.ContigImpl();
    }

    /**
     * Create an instance of {@link Entry.Assembly }
     * 
     */
    public Entry.Assembly createEntryAssembly() {
        return new EntryImpl.AssemblyImpl();
    }

    /**
     * Create an instance of {@link Entry.Feature }
     * 
     */
    public Entry.Feature createEntryFeature() {
        return new EntryImpl.FeatureImpl();
    }

    /**
     * Create an instance of {@link Entry.Feature.Taxon }
     * 
     */
    public Entry.Feature.Taxon createEntryFeatureTaxon() {
        return new EntryImpl.FeatureImpl.TaxonImpl();
    }

    /**
     * Create an instance of {@link Entry.Feature.Taxon.Lineage }
     * 
     */
    public Entry.Feature.Taxon.Lineage createEntryFeatureTaxonLineage() {
        return new EntryImpl.FeatureImpl.TaxonImpl.LineageImpl();
    }

    /**
     * Create an instance of {@link STUDY.DESCRIPTOR }
     * 
     */
    public STUDY.DESCRIPTOR createSTUDYDESCRIPTOR() {
        return new STUDYImpl.DESCRIPTORImpl();
    }

    /**
     * Create an instance of {@link STUDY.DESCRIPTOR.RELATEDSTUDIES }
     * 
     */
    public STUDY.DESCRIPTOR.RELATEDSTUDIES createSTUDYDESCRIPTORRELATEDSTUDIES() {
        return new STUDYImpl.DESCRIPTORImpl.RELATEDSTUDIESImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS }
     * 
     */
    public SUBMISSION.ACTIONS createSUBMISSIONACTIONS() {
        return new SUBMISSIONImpl.ACTIONSImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION createSUBMISSIONACTIONSACTION() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.CONTACTS }
     * 
     */
    public SUBMISSION.CONTACTS createSUBMISSIONCONTACTS() {
        return new SUBMISSIONImpl.CONTACTSImpl();
    }

    /**
     * Create an instance of {@link RUN.DATABLOCK }
     * 
     */
    public RUN.DATABLOCK createRUNDATABLOCK() {
        return new RUNImpl.DATABLOCKImpl();
    }

    /**
     * Create an instance of {@link RUN.DATABLOCK.FILES }
     * 
     */
    public RUN.DATABLOCK.FILES createRUNDATABLOCKFILES() {
        return new RUNImpl.DATABLOCKImpl.FILESImpl();
    }

    /**
     * Create an instance of {@link PlatformType }
     * 
     */
    public PlatformType createPlatformType() {
        return new PlatformTypeImpl();
    }

    /**
     * Create an instance of {@link SpotDescriptorType }
     * 
     */
    public SpotDescriptorType createSpotDescriptorType() {
        return new SpotDescriptorTypeImpl();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC createSpotDescriptorTypeSPOTDECODESPEC() {
        return new SpotDescriptorTypeImpl.SPOTDECODESPECImpl();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC createSpotDescriptorTypeSPOTDECODESPECREADSPEC() {
        return new SpotDescriptorTypeImpl.SPOTDECODESPECImpl.READSPECImpl();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE createSpotDescriptorTypeSPOTDECODESPECREADSPECEXPECTEDBASECALLTABLE() {
        return new SpotDescriptorTypeImpl.SPOTDECODESPECImpl.READSPECImpl.EXPECTEDBASECALLTABLEImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISTYPE }
     * 
     */
    public ANALYSIS.ANALYSISTYPE createANALYSISANALYSISTYPE() {
        return new ANALYSISImpl.ANALYSISTYPEImpl();
    }

    /**
     * Create an instance of {@link PROJECT.PROJECTLINKS }
     * 
     */
    public PROJECT.PROJECTLINKS createPROJECTPROJECTLINKS() {
        return new PROJECTImpl.PROJECTLINKSImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDCHROMOSOMES }
     * 
     */
    public PROJECT.RELATEDCHROMOSOMES createPROJECTRELATEDCHROMOSOMES() {
        return new PROJECTImpl.RELATEDCHROMOSOMESImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDPROJECTS }
     * 
     */
    public PROJECT.RELATEDPROJECTS createPROJECTRELATEDPROJECTS() {
        return new PROJECTImpl.RELATEDPROJECTSImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDPROJECTS.RELATEDPROJECT }
     * 
     */
    public PROJECT.RELATEDPROJECTS.RELATEDPROJECT createPROJECTRELATEDPROJECTSRELATEDPROJECT() {
        return new PROJECTImpl.RELATEDPROJECTSImpl.RELATEDPROJECTImpl();
    }

    /**
     * Create an instance of {@link PROJECT.SUBMISSIONPROJECT }
     * 
     */
    public PROJECT.SUBMISSIONPROJECT createPROJECTSUBMISSIONPROJECT() {
        return new PROJECTImpl.SUBMISSIONPROJECTImpl();
    }

    /**
     * Create an instance of {@link TaxonSet }
     * 
     */
    public TaxonSet createTaxonSet() {
        return new TaxonSetImpl();
    }

    /**
     * Create an instance of {@link ANALYSISSET }
     * 
     */
    public ANALYSISSET createANALYSISSET() {
        return new ANALYSISSETImpl();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierTypeImpl();
    }

    /**
     * Create an instance of {@link PROJECT.PUBLICATIONS }
     * 
     */
    public PROJECT.PUBLICATIONS createPROJECTPUBLICATIONS() {
        return new PROJECTImpl.PUBLICATIONSImpl();
    }

    /**
     * Create an instance of {@link PROJECT.COLLABORATORS }
     * 
     */
    public PROJECT.COLLABORATORS createPROJECTCOLLABORATORS() {
        return new PROJECTImpl.COLLABORATORSImpl();
    }

    /**
     * Create an instance of {@link PROJECT.UMBRELLAPROJECT }
     * 
     */
    public PROJECT.UMBRELLAPROJECT createPROJECTUMBRELLAPROJECT() {
        return new PROJECTImpl.UMBRELLAPROJECTImpl();
    }

    /**
     * Create an instance of {@link PROJECT.PROJECTATTRIBUTES }
     * 
     */
    public PROJECT.PROJECTATTRIBUTES createPROJECTPROJECTATTRIBUTES() {
        return new PROJECTImpl.PROJECTATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link ROOT }
     * 
     */
    public ROOT createROOT() {
        return new ROOTImpl();
    }

    /**
     * Create an instance of {@link EXPERIMENTSET }
     * 
     */
    public EXPERIMENTSET createEXPERIMENTSET() {
        return new EXPERIMENTSETImpl();
    }

    /**
     * Create an instance of {@link RUNSET }
     * 
     */
    public RUNSET createRUNSET() {
        return new RUNSETImpl();
    }

    /**
     * Create an instance of {@link STUDYSET }
     * 
     */
    public STUDYSET createSTUDYSET() {
        return new STUDYSETImpl();
    }

    /**
     * Create an instance of {@link SAMPLESET }
     * 
     */
    public SAMPLESET createSAMPLESET() {
        return new SAMPLESETImpl();
    }

    /**
     * Create an instance of {@link SUBMISSIONSET }
     * 
     */
    public SUBMISSIONSET createSUBMISSIONSET() {
        return new SUBMISSIONSETImpl();
    }

    /**
     * Create an instance of {@link EntrySetType }
     * 
     */
    public EntrySetType createEntrySetType() {
        return new EntrySetTypeImpl();
    }

    /**
     * Create an instance of {@link TaxonSetType }
     * 
     */
    public TaxonSetType createTaxonSetType() {
        return new TaxonSetTypeImpl();
    }

    /**
     * Create an instance of {@link PROJECTSET }
     * 
     */
    public PROJECTSET createPROJECTSET() {
        return new PROJECTSETImpl();
    }

    /**
     * Create an instance of {@link EntrySet }
     * 
     */
    public EntrySet createEntrySet() {
        return new EntrySetImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.STUDYREF }
     * 
     */
    public ANALYSIS.STUDYREF createANALYSISSTUDYREF() {
        return new ANALYSISImpl.STUDYREFImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.SAMPLEREF }
     * 
     */
    public ANALYSIS.SAMPLEREF createANALYSISSAMPLEREF() {
        return new ANALYSISImpl.SAMPLEREFImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.EXPERIMENTREF }
     * 
     */
    public ANALYSIS.EXPERIMENTREF createANALYSISEXPERIMENTREF() {
        return new ANALYSISImpl.EXPERIMENTREFImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.RUNREF }
     * 
     */
    public ANALYSIS.RUNREF createANALYSISRUNREF() {
        return new ANALYSISImpl.RUNREFImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISREF }
     * 
     */
    public ANALYSIS.ANALYSISREF createANALYSISANALYSISREF() {
        return new ANALYSISImpl.ANALYSISREFImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.FILES }
     * 
     */
    public ANALYSIS.FILES createANALYSISFILES() {
        return new ANALYSISImpl.FILESImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISLINKS }
     * 
     */
    public ANALYSIS.ANALYSISLINKS createANALYSISANALYSISLINKS() {
        return new ANALYSISImpl.ANALYSISLINKSImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISATTRIBUTES }
     * 
     */
    public ANALYSIS.ANALYSISATTRIBUTES createANALYSISANALYSISATTRIBUTES() {
        return new ANALYSISImpl.ANALYSISATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link RUN.EXPERIMENTREF }
     * 
     */
    public RUN.EXPERIMENTREF createRUNEXPERIMENTREF() {
        return new RUNImpl.EXPERIMENTREFImpl();
    }

    /**
     * Create an instance of {@link ProcessingType }
     * 
     */
    public ProcessingType createProcessingType() {
        return new ProcessingTypeImpl();
    }

    /**
     * Create an instance of {@link RUN.RUNTYPE }
     * 
     */
    public RUN.RUNTYPE createRUNRUNTYPE() {
        return new RUNImpl.RUNTYPEImpl();
    }

    /**
     * Create an instance of {@link RUN.RUNLINKS }
     * 
     */
    public RUN.RUNLINKS createRUNRUNLINKS() {
        return new RUNImpl.RUNLINKSImpl();
    }

    /**
     * Create an instance of {@link RUN.RUNATTRIBUTES }
     * 
     */
    public RUN.RUNATTRIBUTES createRUNRUNATTRIBUTES() {
        return new RUNImpl.RUNATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.SUBMISSIONLINKS }
     * 
     */
    public SUBMISSION.SUBMISSIONLINKS createSUBMISSIONSUBMISSIONLINKS() {
        return new SUBMISSIONImpl.SUBMISSIONLINKSImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.SUBMISSIONATTRIBUTES }
     * 
     */
    public SUBMISSION.SUBMISSIONATTRIBUTES createSUBMISSIONSUBMISSIONATTRIBUTES() {
        return new SUBMISSIONImpl.SUBMISSIONATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link EXPERIMENT.STUDYREF }
     * 
     */
    public EXPERIMENT.STUDYREF createEXPERIMENTSTUDYREF() {
        return new EXPERIMENTImpl.STUDYREFImpl();
    }

    /**
     * Create an instance of {@link LibraryType }
     * 
     */
    public LibraryType createLibraryType() {
        return new LibraryTypeImpl();
    }

    /**
     * Create an instance of {@link EXPERIMENT.EXPERIMENTLINKS }
     * 
     */
    public EXPERIMENT.EXPERIMENTLINKS createEXPERIMENTEXPERIMENTLINKS() {
        return new EXPERIMENTImpl.EXPERIMENTLINKSImpl();
    }

    /**
     * Create an instance of {@link EXPERIMENT.EXPERIMENTATTRIBUTES }
     * 
     */
    public EXPERIMENT.EXPERIMENTATTRIBUTES createEXPERIMENTEXPERIMENTATTRIBUTES() {
        return new EXPERIMENTImpl.EXPERIMENTATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link STUDY.STUDYLINKS }
     * 
     */
    public STUDY.STUDYLINKS createSTUDYSTUDYLINKS() {
        return new STUDYImpl.STUDYLINKSImpl();
    }

    /**
     * Create an instance of {@link STUDY.STUDYATTRIBUTES }
     * 
     */
    public STUDY.STUDYATTRIBUTES createSTUDYSTUDYATTRIBUTES() {
        return new STUDYImpl.STUDYATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link SAMPLE.SAMPLENAME }
     * 
     */
    public SAMPLE.SAMPLENAME createSAMPLESAMPLENAME() {
        return new SAMPLEImpl.SAMPLENAMEImpl();
    }

    /**
     * Create an instance of {@link SAMPLE.SAMPLELINKS }
     * 
     */
    public SAMPLE.SAMPLELINKS createSAMPLESAMPLELINKS() {
        return new SAMPLEImpl.SAMPLELINKSImpl();
    }

    /**
     * Create an instance of {@link SAMPLE.SAMPLEATTRIBUTES }
     * 
     */
    public SAMPLE.SAMPLEATTRIBUTES createSAMPLESAMPLEATTRIBUTES() {
        return new SAMPLEImpl.SAMPLEATTRIBUTESImpl();
    }

    /**
     * Create an instance of {@link Entry.Reference }
     * 
     */
    public Entry.Reference createEntryReference() {
        return new EntryImpl.ReferenceImpl();
    }

    /**
     * Create an instance of {@link XrefType }
     * 
     */
    public XrefType createXrefType() {
        return new XrefTypeImpl();
    }

    /**
     * Create an instance of {@link uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon.Lineage }
     * 
     */
    public uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon.Lineage createTaxonLineage() {
        return new uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.TaxonImpl.LineageImpl();
    }

    /**
     * Create an instance of {@link uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon.Children }
     * 
     */
    public uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon.Children createTaxonChildren() {
        return new uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.TaxonImpl.ChildrenImpl();
    }

    /**
     * Create an instance of {@link uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon.Synonym }
     * 
     */
    public uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon.Synonym createTaxonSynonym() {
        return new uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.TaxonImpl.SynonymImpl();
    }

    /**
     * Create an instance of {@link AnalysisFileType }
     * 
     */
    public AnalysisFileType createAnalysisFileType() {
        return new AnalysisFileTypeImpl();
    }

    /**
     * Create an instance of {@link OrganismType }
     * 
     */
    public OrganismType createOrganismType() {
        return new OrganismTypeImpl();
    }

    /**
     * Create an instance of {@link SequencingDirectivesType }
     * 
     */
    public SequencingDirectivesType createSequencingDirectivesType() {
        return new SequencingDirectivesTypeImpl();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameTypeImpl();
    }

    /**
     * Create an instance of {@link XRefType }
     * 
     */
    public XRefType createXRefType() {
        return new XRefTypeImpl();
    }

    /**
     * Create an instance of {@link QualifiedNameType }
     * 
     */
    public QualifiedNameType createQualifiedNameType() {
        return new QualifiedNameTypeImpl();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeTypeImpl();
    }

    /**
     * Create an instance of {@link URLType }
     * 
     */
    public URLType createURLType() {
        return new URLTypeImpl();
    }

    /**
     * Create an instance of {@link LinkType.ENTREZLINK }
     * 
     */
    public LinkType.ENTREZLINK createLinkTypeENTREZLINK() {
        return new LinkTypeImpl.ENTREZLINKImpl();
    }

    /**
     * Create an instance of {@link LinkType.URLLINK }
     * 
     */
    public LinkType.URLLINK createLinkTypeURLLINK() {
        return new LinkTypeImpl.URLLINKImpl();
    }

    /**
     * Create an instance of {@link PipelineType.PIPESECTION }
     * 
     */
    public PipelineType.PIPESECTION createPipelineTypePIPESECTION() {
        return new PipelineTypeImpl.PIPESECTIONImpl();
    }

    /**
     * Create an instance of {@link ReferenceSequenceType.SEQUENCE }
     * 
     */
    public ReferenceSequenceType.SEQUENCE createReferenceSequenceTypeSEQUENCE() {
        return new ReferenceSequenceTypeImpl.SEQUENCEImpl();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType.STANDARD }
     * 
     */
    public ReferenceAssemblyType.STANDARD createReferenceAssemblyTypeSTANDARD() {
        return new ReferenceAssemblyTypeImpl.STANDARDImpl();
    }

    /**
     * Create an instance of {@link ReferenceAssemblyType.CUSTOM.URLLINK }
     * 
     */
    public ReferenceAssemblyType.CUSTOM.URLLINK createReferenceAssemblyTypeCUSTOMURLLINK() {
        return new ReferenceAssemblyTypeImpl.CUSTOMImpl.URLLINKImpl();
    }

    /**
     * Create an instance of {@link SampleDescriptorType.POOL }
     * 
     */
    public SampleDescriptorType.POOL createSampleDescriptorTypePOOL() {
        return new SampleDescriptorTypeImpl.POOLImpl();
    }

    /**
     * Create an instance of {@link ChildTaxonType.Children }
     * 
     */
    public ChildTaxonType.Children createChildTaxonTypeChildren() {
        return new ChildTaxonTypeImpl.ChildrenImpl();
    }

    /**
     * Create an instance of {@link PublicationType.PUBLICATIONLINKS.PUBLICATIONLINK }
     * 
     */
    public PublicationType.PUBLICATIONLINKS.PUBLICATIONLINK createPublicationTypePUBLICATIONLINKSPUBLICATIONLINK() {
        return new PublicationTypeImpl.PUBLICATIONLINKSImpl.PUBLICATIONLINKImpl();
    }

    /**
     * Create an instance of {@link PublicationType.STRUCTUREDCITATION.AUTHORS }
     * 
     */
    public PublicationType.STRUCTUREDCITATION.AUTHORS createPublicationTypeSTRUCTUREDCITATIONAUTHORS() {
        return new PublicationTypeImpl.STRUCTUREDCITATIONImpl.AUTHORSImpl();
    }

    /**
     * Create an instance of {@link ParentTaxonType.Children }
     * 
     */
    public ParentTaxonType.Children createParentTaxonTypeChildren() {
        return new ParentTaxonTypeImpl.ChildrenImpl();
    }

    /**
     * Create an instance of {@link PoolMemberType.READLABEL }
     * 
     */
    public PoolMemberType.READLABEL createPoolMemberTypeREADLABEL() {
        return new PoolMemberTypeImpl.READLABELImpl();
    }

    /**
     * Create an instance of {@link LibraryDescriptorType.TARGETEDLOCI.LOCUS }
     * 
     */
    public LibraryDescriptorType.TARGETEDLOCI.LOCUS createLibraryDescriptorTypeTARGETEDLOCILOCUS() {
        return new LibraryDescriptorTypeImpl.TARGETEDLOCIImpl.LOCUSImpl();
    }

    /**
     * Create an instance of {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
     * 
     */
    public LibraryDescriptorType.LIBRARYLAYOUT.PAIRED createLibraryDescriptorTypeLIBRARYLAYOUTPAIRED() {
        return new LibraryDescriptorTypeImpl.LIBRARYLAYOUTImpl.PAIREDImpl();
    }

    /**
     * Create an instance of {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
     * 
     */
    public LibraryDescriptorType.LIBRARYLAYOUT.SINGLE createLibraryDescriptorTypeLIBRARYLAYOUTSINGLE() {
        return new LibraryDescriptorTypeImpl.LIBRARYLAYOUTImpl.SINGLEImpl();
    }

    /**
     * Create an instance of {@link Entry.Contig.Range }
     * 
     */
    public Entry.Contig.Range createEntryContigRange() {
        return new EntryImpl.ContigImpl.RangeImpl();
    }

    /**
     * Create an instance of {@link Entry.Contig.Gap }
     * 
     */
    public Entry.Contig.Gap createEntryContigGap() {
        return new EntryImpl.ContigImpl.GapImpl();
    }

    /**
     * Create an instance of {@link Entry.Assembly.Range }
     * 
     */
    public Entry.Assembly.Range createEntryAssemblyRange() {
        return new EntryImpl.AssemblyImpl.RangeImpl();
    }

    /**
     * Create an instance of {@link Entry.Feature.Qualifier }
     * 
     */
    public Entry.Feature.Qualifier createEntryFeatureQualifier() {
        return new EntryImpl.FeatureImpl.QualifierImpl();
    }

    /**
     * Create an instance of {@link Entry.Feature.Taxon.Lineage.Taxon2 }
     * 
     */
    public Entry.Feature.Taxon.Lineage.Taxon2 createEntryFeatureTaxonLineageTaxon() {
        return new EntryImpl.FeatureImpl.TaxonImpl.LineageImpl.Taxon2Impl();
    }

    /**
     * Create an instance of {@link STUDY.DESCRIPTOR.STUDYTYPE }
     * 
     */
    public STUDY.DESCRIPTOR.STUDYTYPE createSTUDYDESCRIPTORSTUDYTYPE() {
        return new STUDYImpl.DESCRIPTORImpl.STUDYTYPEImpl();
    }

    /**
     * Create an instance of {@link STUDY.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY }
     * 
     */
    public STUDY.DESCRIPTOR.RELATEDSTUDIES.RELATEDSTUDY createSTUDYDESCRIPTORRELATEDSTUDIESRELATEDSTUDY() {
        return new STUDYImpl.DESCRIPTORImpl.RELATEDSTUDIESImpl.RELATEDSTUDYImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.VALIDATE }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.VALIDATE createSUBMISSIONACTIONSACTIONVALIDATE() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.VALIDATEImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.PROTECT }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.PROTECT createSUBMISSIONACTIONSACTIONPROTECT() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.PROTECTImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.RELEASE }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.RELEASE createSUBMISSIONACTIONSACTIONRELEASE() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.RELEASEImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.HOLD }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.HOLD createSUBMISSIONACTIONSACTIONHOLD() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.HOLDImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.SUPPRESS }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.SUPPRESS createSUBMISSIONACTIONSACTIONSUPPRESS() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.SUPPRESSImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.CANCEL }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.CANCEL createSUBMISSIONACTIONSACTIONCANCEL() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.CANCELImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.MODIFY }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.MODIFY createSUBMISSIONACTIONSACTIONMODIFY() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.MODIFYImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.ACTIONS.ACTION.ADD }
     * 
     */
    public SUBMISSION.ACTIONS.ACTION.ADD createSUBMISSIONACTIONSACTIONADD() {
        return new SUBMISSIONImpl.ACTIONSImpl.ACTIONImpl.ADDImpl();
    }

    /**
     * Create an instance of {@link SUBMISSION.CONTACTS.CONTACT }
     * 
     */
    public SUBMISSION.CONTACTS.CONTACT createSUBMISSIONCONTACTSCONTACT() {
        return new SUBMISSIONImpl.CONTACTSImpl.CONTACTImpl();
    }

    /**
     * Create an instance of {@link RUN.DATABLOCK.FILES.FILE }
     * 
     */
    public RUN.DATABLOCK.FILES.FILE createRUNDATABLOCKFILESFILE() {
        return new RUNImpl.DATABLOCKImpl.FILESImpl.FILEImpl();
    }

    /**
     * Create an instance of {@link PlatformType.CAPILLARY }
     * 
     */
    public PlatformType.CAPILLARY createPlatformTypeCAPILLARY() {
        return new PlatformTypeImpl.CAPILLARYImpl();
    }

    /**
     * Create an instance of {@link PlatformType.IONTORRENT }
     * 
     */
    public PlatformType.IONTORRENT createPlatformTypeIONTORRENT() {
        return new PlatformTypeImpl.IONTORRENTImpl();
    }

    /**
     * Create an instance of {@link PlatformType.PACBIOSMRT }
     * 
     */
    public PlatformType.PACBIOSMRT createPlatformTypePACBIOSMRT() {
        return new PlatformTypeImpl.PACBIOSMRTImpl();
    }

    /**
     * Create an instance of {@link PlatformType.OXFORDNANOPORE }
     * 
     */
    public PlatformType.OXFORDNANOPORE createPlatformTypeOXFORDNANOPORE() {
        return new PlatformTypeImpl.OXFORDNANOPOREImpl();
    }

    /**
     * Create an instance of {@link PlatformType.COMPLETEGENOMICS }
     * 
     */
    public PlatformType.COMPLETEGENOMICS createPlatformTypeCOMPLETEGENOMICS() {
        return new PlatformTypeImpl.COMPLETEGENOMICSImpl();
    }

    /**
     * Create an instance of {@link PlatformType.ABISOLID }
     * 
     */
    public PlatformType.ABISOLID createPlatformTypeABISOLID() {
        return new PlatformTypeImpl.ABISOLIDImpl();
    }

    /**
     * Create an instance of {@link PlatformType.HELICOS }
     * 
     */
    public PlatformType.HELICOS createPlatformTypeHELICOS() {
        return new PlatformTypeImpl.HELICOSImpl();
    }

    /**
     * Create an instance of {@link PlatformType.ILLUMINA }
     * 
     */
    public PlatformType.ILLUMINA createPlatformTypeILLUMINA() {
        return new PlatformTypeImpl.ILLUMINAImpl();
    }

    /**
     * Create an instance of {@link PlatformType.LS454 }
     * 
     */
    public PlatformType.LS454 createPlatformTypeLS454() {
        return new PlatformTypeImpl.LS454Impl();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC.RELATIVEORDER createSpotDescriptorTypeSPOTDECODESPECREADSPECRELATIVEORDER() {
        return new SpotDescriptorTypeImpl.SPOTDECODESPECImpl.READSPECImpl.RELATIVEORDERImpl();
    }

    /**
     * Create an instance of {@link SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL }
     * 
     */
    public SpotDescriptorType.SPOTDECODESPEC.READSPEC.EXPECTEDBASECALLTABLE.BASECALL createSpotDescriptorTypeSPOTDECODESPECREADSPECEXPECTEDBASECALLTABLEBASECALL() {
        return new SpotDescriptorTypeImpl.SPOTDECODESPECImpl.READSPECImpl.EXPECTEDBASECALLTABLEImpl.BASECALLImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISTYPE.SAMPLEPHENOTYPE }
     * 
     */
    public ANALYSIS.ANALYSISTYPE.SAMPLEPHENOTYPE createANALYSISANALYSISTYPESAMPLEPHENOTYPE() {
        return new ANALYSISImpl.ANALYSISTYPEImpl.SAMPLEPHENOTYPEImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISTYPE.SEQUENCEANNOTATION }
     * 
     */
    public ANALYSIS.ANALYSISTYPE.SEQUENCEANNOTATION createANALYSISANALYSISTYPESEQUENCEANNOTATION() {
        return new ANALYSISImpl.ANALYSISTYPEImpl.SEQUENCEANNOTATIONImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISTYPE.SEQUENCEASSEMBLY }
     * 
     */
    public ANALYSIS.ANALYSISTYPE.SEQUENCEASSEMBLY createANALYSISANALYSISTYPESEQUENCEASSEMBLY() {
        return new ANALYSISImpl.ANALYSISTYPEImpl.SEQUENCEASSEMBLYImpl();
    }

    /**
     * Create an instance of {@link ANALYSIS.ANALYSISTYPE.SEQUENCEVARIATION }
     * 
     */
    public ANALYSIS.ANALYSISTYPE.SEQUENCEVARIATION createANALYSISANALYSISTYPESEQUENCEVARIATION() {
        return new ANALYSISImpl.ANALYSISTYPEImpl.SEQUENCEVARIATIONImpl();
    }

    /**
     * Create an instance of {@link PROJECT.PROJECTLINKS.PROJECTLINK }
     * 
     */
    public PROJECT.PROJECTLINKS.PROJECTLINK createPROJECTPROJECTLINKSPROJECTLINK() {
        return new PROJECTImpl.PROJECTLINKSImpl.PROJECTLINKImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDCHROMOSOMES.RELATEDCHROMOSOME }
     * 
     */
    public PROJECT.RELATEDCHROMOSOMES.RELATEDCHROMOSOME createPROJECTRELATEDCHROMOSOMESRELATEDCHROMOSOME() {
        return new PROJECTImpl.RELATEDCHROMOSOMESImpl.RELATEDCHROMOSOMEImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDPROJECTS.RELATEDPROJECT.PEERPROJECT }
     * 
     */
    public PROJECT.RELATEDPROJECTS.RELATEDPROJECT.PEERPROJECT createPROJECTRELATEDPROJECTSRELATEDPROJECTPEERPROJECT() {
        return new PROJECTImpl.RELATEDPROJECTSImpl.RELATEDPROJECTImpl.PEERPROJECTImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDPROJECTS.RELATEDPROJECT.CHILDPROJECT }
     * 
     */
    public PROJECT.RELATEDPROJECTS.RELATEDPROJECT.CHILDPROJECT createPROJECTRELATEDPROJECTSRELATEDPROJECTCHILDPROJECT() {
        return new PROJECTImpl.RELATEDPROJECTSImpl.RELATEDPROJECTImpl.CHILDPROJECTImpl();
    }

    /**
     * Create an instance of {@link PROJECT.RELATEDPROJECTS.RELATEDPROJECT.PARENTPROJECT }
     * 
     */
    public PROJECT.RELATEDPROJECTS.RELATEDPROJECT.PARENTPROJECT createPROJECTRELATEDPROJECTSRELATEDPROJECTPARENTPROJECT() {
        return new PROJECTImpl.RELATEDPROJECTSImpl.RELATEDPROJECTImpl.PARENTPROJECTImpl();
    }

    /**
     * Create an instance of {@link PROJECT.SUBMISSIONPROJECT.SEQUENCINGPROJECT }
     * 
     */
    public PROJECT.SUBMISSIONPROJECT.SEQUENCINGPROJECT createPROJECTSUBMISSIONPROJECTSEQUENCINGPROJECT() {
        return new PROJECTImpl.SUBMISSIONPROJECTImpl.SEQUENCINGPROJECTImpl();
    }

}

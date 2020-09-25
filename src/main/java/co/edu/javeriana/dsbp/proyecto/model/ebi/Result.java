package co.edu.javeriana.dsbp.proyecto.model.ebi;

import java.sql.Date;
import java.util.List;

public class Result {
    private int id;
    private String source;
    private String pmid;
    private String pmcid;
    private List<FullTextId> fullTextIdList;
    private String doi;
    private String title;
    private String authorString;
    private String journalTitle;
    private String issue;
    private String journalVolume;
    private int pubYear;
    private String journalIssn;
    private String pageInfo;
    private String pubType;
    private char isOpenAccess;
    private char inEPMC;
    private char inPMC;
    private char hasPDF;
    private char hasBook;
    private char hasSuppl;
    private int citedByCount;
    private char hasReferences;
    private char hasTextMinedTerms;
    private char hasDbCrossReferences;
    private char hasLabsLinks;
    private char hasTMAccessionNumbers;
    private Date firstIndexDate;
    private Date firstPublicationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getPmcid() {
        return pmcid;
    }

    public void setPmcid(String pmcid) {
        this.pmcid = pmcid;
    }

    public List<FullTextId> getFullTextIdList() {
        return fullTextIdList;
    }

    public void setFullTextIdList(List<FullTextId> fullTextIdList) {
        this.fullTextIdList = fullTextIdList;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorString() {
        return authorString;
    }

    public void setAuthorString(String authorString) {
        this.authorString = authorString;
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getJournalVolume() {
        return journalVolume;
    }

    public void setJournalVolume(String journalVolume) {
        this.journalVolume = journalVolume;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public String getJournalIssn() {
        return journalIssn;
    }

    public void setJournalIssn(String journalIssn) {
        this.journalIssn = journalIssn;
    }

    public String getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(String pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getPubType() {
        return pubType;
    }

    public void setPubType(String pubType) {
        this.pubType = pubType;
    }

    public char getIsOpenAccess() {
        return isOpenAccess;
    }

    public void setIsOpenAccess(char isOpenAccess) {
        this.isOpenAccess = isOpenAccess;
    }

    public char getInEPMC() {
        return inEPMC;
    }

    public void setInEPMC(char inEPMC) {
        this.inEPMC = inEPMC;
    }

    public char getInPMC() {
        return inPMC;
    }

    public void setInPMC(char inPMC) {
        this.inPMC = inPMC;
    }

    public char getHasPDF() {
        return hasPDF;
    }

    public void setHasPDF(char hasPDF) {
        this.hasPDF = hasPDF;
    }

    public char getHasBook() {
        return hasBook;
    }

    public void setHasBook(char hasBook) {
        this.hasBook = hasBook;
    }

    public char getHasSuppl() {
        return hasSuppl;
    }

    public void setHasSuppl(char hasSuppl) {
        this.hasSuppl = hasSuppl;
    }

    public int getCitedByCount() {
        return citedByCount;
    }

    public void setCitedByCount(int citedByCount) {
        this.citedByCount = citedByCount;
    }

    public char getHasReferences() {
        return hasReferences;
    }

    public void setHasReferences(char hasReferences) {
        this.hasReferences = hasReferences;
    }

    public char getHasTextMinedTerms() {
        return hasTextMinedTerms;
    }

    public void setHasTextMinedTerms(char hasTextMinedTerms) {
        this.hasTextMinedTerms = hasTextMinedTerms;
    }

    public char getHasDbCrossReferences() {
        return hasDbCrossReferences;
    }

    public void setHasDbCrossReferences(char hasDbCrossReferences) {
        this.hasDbCrossReferences = hasDbCrossReferences;
    }

    public char getHasLabsLinks() {
        return hasLabsLinks;
    }

    public void setHasLabsLinks(char hasLabsLinks) {
        this.hasLabsLinks = hasLabsLinks;
    }

    public char getHasTMAccessionNumbers() {
        return hasTMAccessionNumbers;
    }

    public void setHasTMAccessionNumbers(char hasTMAccessionNumbers) {
        this.hasTMAccessionNumbers = hasTMAccessionNumbers;
    }

    public Date getFirstIndexDate() {
        return firstIndexDate;
    }

    public void setFirstIndexDate(Date firstIndexDate) {
        this.firstIndexDate = firstIndexDate;
    }

    public Date getFirstPublicationDate() {
        return firstPublicationDate;
    }

    public void setFirstPublicationDate(Date firstPublicationDate) {
        this.firstPublicationDate = firstPublicationDate;
    }
}

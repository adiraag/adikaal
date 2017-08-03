package com.cdk;

public class CricketMatch {
    private String country1;
    private String country2;
    private String matchType;
    private int overs;
    private String city;
    private String winner;

    public CricketMatch(String country1, String country2, String matchType, int overs, String city, String winner) {
        this.country1 = country1;
        this.country2 = country2;
        this.matchType = matchType;
        this.overs = overs;
        this.city = city;
        this.winner = winner;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "CricketMatch{" +
                "country1='" + country1 + '\'' +
                ", country2='" + country2 + '\'' +
                ", matchType='" + matchType + '\'' +
                ", overs=" + overs +
                ", city='" + city + '\'' +
                ", winner='" + winner + '\'' +
                '}';
    }
}
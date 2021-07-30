package site.danielszczesny.backend.model;

import site.danielszczesny.backend.dto.SummonerDTO;

public class Summoner {

    private String accountId;
    private int profileIconId;
    private long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private long summonerLevel;

    public Summoner(SummonerDTO summonerDTO) {
        this.accountId = summonerDTO.getAccountId();
        this.profileIconId = summonerDTO.getProfileIconId();
        this.revisionDate = summonerDTO.getRevisionDate();
        this.name = summonerDTO.getName();
        this.id = summonerDTO.getId();
        this.puuid = summonerDTO.getPuuid();
        this.summonerLevel = summonerDTO.getSummonerLevel();
    }
}

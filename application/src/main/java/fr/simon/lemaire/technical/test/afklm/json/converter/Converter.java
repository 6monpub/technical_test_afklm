package fr.simon.lemaire.technical.test.afklm.json.converter;

public interface Converter<VO, JSON> {

    public abstract JSON convertVoToJson(VO vo);

    public abstract VO convertJsonToVo(JSON json);
}

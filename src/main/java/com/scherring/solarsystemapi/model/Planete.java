package com.scherring.solarsystemapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import javax.annotation.processing.Generated;

@Service
public class Planete {

    @Id
    private long order;

    private String type;
    private String name;
    private String discovery;
    private double avgDistKm;
    private double avgDistAU;
    private double avgDistMiles;
    private double aphelionKm;
    private double aphelionAU;
    private double aphelionMiles;
    private double perihelionKm;
    private double perihelionAU;
    private double diameterKm;
    private double diameterEarth;
    private double diamterMiles;
    private double volume;
    private double massKg;
    private double massEarth;
    private double massSolarSystem;
    private double densityKg;
    private double densityLbs;
    private double orbitalPeriodDays;
    private double orbitalPeriodYear;
    private String rotationPeriod;
    private double obliquity;
    private double orbitalInclination;
    private double orbitalEccentricity;
    private double gravityM;
    private double gravityft;
    private double orbitalVelocityKm;
    private double orbitalVelocityMiles;
    private double escapeVelocityKm;
    private double escapeVelocityMiles;
    private double meanTemperatureC;
    private double meanTemperatureKelvin;
    private double meanTemperatureF;
    private double lowestTemperatureC;
    private double highestTemperatureC;
    private double numberSatellites;
    private double albedo;
    private boolean ringSystem;
    private double surfacePressure;
    private boolean globalMagneticField;
    private String urlImage;

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscovery() {
        return discovery;
    }

    public void setDiscovery(String discovery) {
        this.discovery = discovery;
    }

    public double getAvgDistKm() {
        return avgDistKm;
    }

    public void setAvgDistKm(double avgDistKm) {
        this.avgDistKm = avgDistKm;
    }

    public double getAvgDistAU() {
        return avgDistAU;
    }

    public void setAvgDistAU(double avgDistAU) {
        this.avgDistAU = avgDistAU;
    }

    public double getAvgDistMiles() {
        return avgDistMiles;
    }

    public void setAvgDistMiles(double avgDistMiles) {
        this.avgDistMiles = avgDistMiles;
    }

    public double getAphelionKm() {
        return aphelionKm;
    }

    public void setAphelionKm(double aphelionKm) {
        this.aphelionKm = aphelionKm;
    }

    public double getAphelionAU() {
        return aphelionAU;
    }

    public void setAphelionAU(double aphelionAU) {
        this.aphelionAU = aphelionAU;
    }

    public double getAphelionMiles() {
        return aphelionMiles;
    }

    public void setAphelionMiles(double aphelionMiles) {
        this.aphelionMiles = aphelionMiles;
    }

    public double getPerihelionKm() {
        return perihelionKm;
    }

    public void setPerihelionKm(double perihelionKm) {
        this.perihelionKm = perihelionKm;
    }

    public double getPerihelionAU() {
        return perihelionAU;
    }

    public void setPerihelionAU(double perihelionAU) {
        this.perihelionAU = perihelionAU;
    }

    public double getDiameterKm() {
        return diameterKm;
    }

    public void setDiameterKm(double diameterKm) {
        this.diameterKm = diameterKm;
    }

    public double getDiameterEarth() {
        return diameterEarth;
    }

    public void setDiameterEarth(double diameterEarth) {
        this.diameterEarth = diameterEarth;
    }

    public double getDiamterMiles() {
        return diamterMiles;
    }

    public void setDiamterMiles(double diamterMiles) {
        this.diamterMiles = diamterMiles;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMassKg() {
        return massKg;
    }

    public void setMassKg(double massKg) {
        this.massKg = massKg;
    }

    public double getMassEarth() {
        return massEarth;
    }

    public void setMassEarth(double massEarth) {
        this.massEarth = massEarth;
    }

    public double getMassSolarSystem() {
        return massSolarSystem;
    }

    public void setMassSolarSystem(double massSolarSystem) {
        this.massSolarSystem = massSolarSystem;
    }

    public double getDensityKg() {
        return densityKg;
    }

    public void setDensityKg(double densityKg) {
        this.densityKg = densityKg;
    }

    public double getDensityLbs() {
        return densityLbs;
    }

    public void setDensityLbs(double densityLbs) {
        this.densityLbs = densityLbs;
    }

    public double getOrbitalPeriodDays() {
        return orbitalPeriodDays;
    }

    public void setOrbitalPeriodDays(double orbitalPeriodDays) {
        this.orbitalPeriodDays = orbitalPeriodDays;
    }

    public double getOrbitalPeriodYear() {
        return orbitalPeriodYear;
    }

    public void setOrbitalPeriodYear(double orbitalPeriodYear) {
        this.orbitalPeriodYear = orbitalPeriodYear;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public double getObliquity() {
        return obliquity;
    }

    public void setObliquity(double obliquity) {
        this.obliquity = obliquity;
    }

    public double getOrbitalInclination() {
        return orbitalInclination;
    }

    public void setOrbitalInclination(double orbitalInclination) {
        this.orbitalInclination = orbitalInclination;
    }

    public double getOrbitalEccentricity() {
        return orbitalEccentricity;
    }

    public void setOrbitalEccentricity(double orbitalEccentricity) {
        this.orbitalEccentricity = orbitalEccentricity;
    }

    public double getGravityM() {
        return gravityM;
    }

    public void setGravityM(double gravityM) {
        this.gravityM = gravityM;
    }

    public double getGravityft() {
        return gravityft;
    }

    public void setGravityft(double gravityft) {
        this.gravityft = gravityft;
    }

    public double getOrbitalVelocityKm() {
        return orbitalVelocityKm;
    }

    public void setOrbitalVelocityKm(double orbitalVelocityKm) {
        this.orbitalVelocityKm = orbitalVelocityKm;
    }

    public double getOrbitalVelocityMiles() {
        return orbitalVelocityMiles;
    }

    public void setOrbitalVelocityMiles(double orbitalVelocityMiles) {
        this.orbitalVelocityMiles = orbitalVelocityMiles;
    }

    public double getEscapeVelocityKm() {
        return escapeVelocityKm;
    }

    public void setEscapeVelocityKm(double escapeVelocityKm) {
        this.escapeVelocityKm = escapeVelocityKm;
    }

    public double getEscapeVelocityMiles() {
        return escapeVelocityMiles;
    }

    public void setEscapeVelocityMiles(double escapeVelocityMiles) {
        this.escapeVelocityMiles = escapeVelocityMiles;
    }

    public double getMeanTemperatureC() {
        return meanTemperatureC;
    }

    public void setMeanTemperatureC(double meanTemperatureC) {
        this.meanTemperatureC = meanTemperatureC;
    }

    public double getMeanTemperatureKelvin() {
        return meanTemperatureKelvin;
    }

    public void setMeanTemperatureKelvin(double meanTemperatureKelvin) {
        this.meanTemperatureKelvin = meanTemperatureKelvin;
    }

    public double getMeanTemperatureF() {
        return meanTemperatureF;
    }

    public void setMeanTemperatureF(double meanTemperatureF) {
        this.meanTemperatureF = meanTemperatureF;
    }

    public double getLowestTemperatureC() {
        return lowestTemperatureC;
    }

    public void setLowestTemperatureC(double lowestTemperatureC) {
        this.lowestTemperatureC = lowestTemperatureC;
    }

    public double getHighestTemperatureC() {
        return highestTemperatureC;
    }

    public void setHighestTemperatureC(double highestTemperatureC) {
        this.highestTemperatureC = highestTemperatureC;
    }

    public double getNumberSatellites() {
        return numberSatellites;
    }

    public void setNumberSatellites(double numberSatellites) {
        this.numberSatellites = numberSatellites;
    }

    public double getAlbedo() {
        return albedo;
    }

    public void setAlbedo(double albedo) {
        this.albedo = albedo;
    }

    public boolean isRingSystem() {
        return ringSystem;
    }

    public void setRingSystem(boolean ringSystem) {
        this.ringSystem = ringSystem;
    }

    public double getSurfacePressure() {
        return surfacePressure;
    }

    public void setSurfacePressure(double surfacePressure) {
        this.surfacePressure = surfacePressure;
    }

    public boolean isGlobalMagneticField() {
        return globalMagneticField;
    }

    public void setGlobalMagneticField(boolean globalMagneticField) {
        this.globalMagneticField = globalMagneticField;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}

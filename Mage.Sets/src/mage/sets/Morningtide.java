/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import java.util.GregorianCalendar;
import mage.constants.SetType;
import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import java.util.List;

/**
 *
 * @author North
 */
public class Morningtide extends ExpansionSet {

    private static final Morningtide fINSTANCE = new Morningtide();

    public static Morningtide getInstance() {
        return fINSTANCE;
    }

    private Morningtide() {
        super("Morningtide", "MOR", "mage.sets.morningtide", ExpansionSet.buildDate(2008, 1, 1), SetType.EXPANSION);
        this.blockName = "Lorwyn";
        this.parentSet = Morningtide.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Ambassador Oak", 113, Rarity.COMMON, mage.cards.a.AmbassadorOak.class));
        cards.add(new SetCardInfo("Auntie's Snitch", 57, Rarity.RARE, mage.cards.a.AuntiesSnitch.class));
        cards.add(new SetCardInfo("Ballyrush Banneret", 1, Rarity.COMMON, mage.cards.b.BallyrushBanneret.class));
        cards.add(new SetCardInfo("Battletide Alchemist", 2, Rarity.RARE, mage.cards.b.BattletideAlchemist.class));
        cards.add(new SetCardInfo("Bitterblossom", 58, Rarity.RARE, mage.cards.b.Bitterblossom.class));
        cards.add(new SetCardInfo("Blightsoil Druid", 59, Rarity.COMMON, mage.cards.b.BlightsoilDruid.class));
        cards.add(new SetCardInfo("Boldwyr Heavyweights", 85, Rarity.RARE, mage.cards.b.BoldwyrHeavyweights.class));
        cards.add(new SetCardInfo("Boldwyr Intimidator", 86, Rarity.UNCOMMON, mage.cards.b.BoldwyrIntimidator.class));
        cards.add(new SetCardInfo("Borderland Behemoth", 87, Rarity.RARE, mage.cards.b.BorderlandBehemoth.class));
        cards.add(new SetCardInfo("Bosk Banneret", 114, Rarity.COMMON, mage.cards.b.BoskBanneret.class));
        cards.add(new SetCardInfo("Bramblewood Paragon", 115, Rarity.UNCOMMON, mage.cards.b.BramblewoodParagon.class));
        cards.add(new SetCardInfo("Brighthearth Banneret", 88, Rarity.COMMON, mage.cards.b.BrighthearthBanneret.class));
        cards.add(new SetCardInfo("Burrenton Bombardier", 3, Rarity.COMMON, mage.cards.b.BurrentonBombardier.class));
        cards.add(new SetCardInfo("Burrenton Shield-Bearers", 4, Rarity.COMMON, mage.cards.b.BurrentonShieldBearers.class));
        cards.add(new SetCardInfo("Cenn's Tactician", 5, Rarity.UNCOMMON, mage.cards.c.CennsTactician.class));
        cards.add(new SetCardInfo("Chameleon Colossus", 116, Rarity.RARE, mage.cards.c.ChameleonColossus.class));
        cards.add(new SetCardInfo("Changeling Sentinel", 6, Rarity.COMMON, mage.cards.c.ChangelingSentinel.class));
        cards.add(new SetCardInfo("Cloak and Dagger", 141, Rarity.UNCOMMON, mage.cards.c.CloakAndDagger.class));
        cards.add(new SetCardInfo("Coordinated Barrage", 7, Rarity.COMMON, mage.cards.c.CoordinatedBarrage.class));
        cards.add(new SetCardInfo("Countryside Crusher", 89, Rarity.RARE, mage.cards.c.CountrysideCrusher.class));
        cards.add(new SetCardInfo("Cream of the Crop", 117, Rarity.RARE, mage.cards.c.CreamOfTheCrop.class));
        cards.add(new SetCardInfo("Daily Regimen", 8, Rarity.UNCOMMON, mage.cards.d.DailyRegimen.class));
        cards.add(new SetCardInfo("Declaration of Naught", 29, Rarity.RARE, mage.cards.d.DeclarationOfNaught.class));
        cards.add(new SetCardInfo("Deglamer", 118, Rarity.COMMON, mage.cards.d.Deglamer.class));
        cards.add(new SetCardInfo("Dewdrop Spy", 30, Rarity.COMMON, mage.cards.d.DewdropSpy.class));
        cards.add(new SetCardInfo("Disperse", 31, Rarity.COMMON, mage.cards.d.Disperse.class));
        cards.add(new SetCardInfo("Distant Melody", 32, Rarity.COMMON, mage.cards.d.DistantMelody.class));
        cards.add(new SetCardInfo("Diviner's Wand", 142, Rarity.UNCOMMON, mage.cards.d.DivinersWand.class));
        cards.add(new SetCardInfo("Door of Destinies", 143, Rarity.RARE, mage.cards.d.DoorOfDestinies.class));
        cards.add(new SetCardInfo("Earthbrawn", 119, Rarity.COMMON, mage.cards.e.Earthbrawn.class));
        cards.add(new SetCardInfo("Earwig Squad", 60, Rarity.RARE, mage.cards.e.EarwigSquad.class));
        cards.add(new SetCardInfo("Elvish Warrior", 120, Rarity.COMMON, mage.cards.e.ElvishWarrior.class));
        cards.add(new SetCardInfo("Everbark Shaman", 121, Rarity.COMMON, mage.cards.e.EverbarkShaman.class));
        cards.add(new SetCardInfo("Fencer Clique", 33, Rarity.COMMON, mage.cards.f.FencerClique.class));
        cards.add(new SetCardInfo("Fendeep Summoner", 61, Rarity.RARE, mage.cards.f.FendeepSummoner.class));
        cards.add(new SetCardInfo("Fertilid", 122, Rarity.COMMON, mage.cards.f.Fertilid.class));
        cards.add(new SetCardInfo("Festercreep", 62, Rarity.COMMON, mage.cards.f.Festercreep.class));
        cards.add(new SetCardInfo("Feudkiller's Verdict", 9, Rarity.RARE, mage.cards.f.FeudkillersVerdict.class));
        cards.add(new SetCardInfo("Final-Sting Faerie", 63, Rarity.COMMON, mage.cards.f.FinalStingFaerie.class));
        cards.add(new SetCardInfo("Fire Juggler", 90, Rarity.COMMON, mage.cards.f.FireJuggler.class));
        cards.add(new SetCardInfo("Floodchaser", 34, Rarity.COMMON, mage.cards.f.Floodchaser.class));
        cards.add(new SetCardInfo("Forfend", 10, Rarity.COMMON, mage.cards.f.Forfend.class));
        cards.add(new SetCardInfo("Frogtosser Banneret", 64, Rarity.COMMON, mage.cards.f.FrogtosserBanneret.class));
        cards.add(new SetCardInfo("Game-Trail Changeling", 123, Rarity.COMMON, mage.cards.g.GameTrailChangeling.class));
        cards.add(new SetCardInfo("Gilt-Leaf Archdruid", 124, Rarity.RARE, mage.cards.g.GiltLeafArchdruid.class));
        cards.add(new SetCardInfo("Graceful Reprieve", 11, Rarity.UNCOMMON, mage.cards.g.GracefulReprieve.class));
        cards.add(new SetCardInfo("Greatbow Doyen", 125, Rarity.RARE, mage.cards.g.GreatbowDoyen.class));
        cards.add(new SetCardInfo("Grimoire Thief", 35, Rarity.RARE, mage.cards.g.GrimoireThief.class));
        cards.add(new SetCardInfo("Heritage Druid", 126, Rarity.UNCOMMON, mage.cards.h.HeritageDruid.class));
        cards.add(new SetCardInfo("Hostile Realm", 91, Rarity.COMMON, mage.cards.h.HostileRealm.class));
        cards.add(new SetCardInfo("Hunting Triad", 127, Rarity.UNCOMMON, mage.cards.h.HuntingTriad.class));
        cards.add(new SetCardInfo("Idyllic Tutor", 12, Rarity.RARE, mage.cards.i.IdyllicTutor.class));
        cards.add(new SetCardInfo("Indomitable Ancients", 13, Rarity.RARE, mage.cards.i.IndomitableAncients.class));
        cards.add(new SetCardInfo("Ink Dissolver", 36, Rarity.COMMON, mage.cards.i.InkDissolver.class));
        cards.add(new SetCardInfo("Inspired Sprite", 37, Rarity.UNCOMMON, mage.cards.i.InspiredSprite.class));
        cards.add(new SetCardInfo("Kindled Fury", 92, Rarity.COMMON, mage.cards.k.KindledFury.class));
        cards.add(new SetCardInfo("Kinsbaile Borderguard", 14, Rarity.RARE, mage.cards.k.KinsbaileBorderguard.class));
        cards.add(new SetCardInfo("Kinsbaile Cavalier", 15, Rarity.RARE, mage.cards.k.KinsbaileCavalier.class));
        cards.add(new SetCardInfo("Kithkin Zephyrnaut", 16, Rarity.COMMON, mage.cards.k.KithkinZephyrnaut.class));
        cards.add(new SetCardInfo("Knowledge Exploitation", 38, Rarity.RARE, mage.cards.k.KnowledgeExploitation.class));
        cards.add(new SetCardInfo("Latchkey Faerie", 39, Rarity.COMMON, mage.cards.l.LatchkeyFaerie.class));
        cards.add(new SetCardInfo("Leaf-Crowned Elder", 128, Rarity.RARE, mage.cards.l.LeafCrownedElder.class));
        cards.add(new SetCardInfo("Lightning Crafter", 93, Rarity.RARE, mage.cards.l.LightningCrafter.class));
        cards.add(new SetCardInfo("Luminescent Rain", 129, Rarity.COMMON, mage.cards.l.LuminescentRain.class));
        cards.add(new SetCardInfo("Lunk Errant", 94, Rarity.COMMON, mage.cards.l.LunkErrant.class));
        cards.add(new SetCardInfo("Lys Alana Bowmaster", 130, Rarity.COMMON, mage.cards.l.LysAlanaBowmaster.class));
        cards.add(new SetCardInfo("Maralen of the Mornsong", 65, Rarity.RARE, mage.cards.m.MaralenOfTheMornsong.class));
        cards.add(new SetCardInfo("Meadowboon", 17, Rarity.UNCOMMON, mage.cards.m.Meadowboon.class));
        cards.add(new SetCardInfo("Merrow Witsniper", 40, Rarity.COMMON, mage.cards.m.MerrowWitsniper.class));
        cards.add(new SetCardInfo("Mind Shatter", 66, Rarity.RARE, mage.cards.m.MindShatter.class));
        cards.add(new SetCardInfo("Mind Spring", 41, Rarity.RARE, mage.cards.m.MindSpring.class));
        cards.add(new SetCardInfo("Moonglove Changeling", 67, Rarity.COMMON, mage.cards.m.MoongloveChangeling.class));
        cards.add(new SetCardInfo("Morsel Theft", 68, Rarity.COMMON, mage.cards.m.MorselTheft.class));
        cards.add(new SetCardInfo("Mosquito Guard", 18, Rarity.COMMON, mage.cards.m.MosquitoGuard.class));
        cards.add(new SetCardInfo("Mothdust Changeling", 42, Rarity.COMMON, mage.cards.m.MothdustChangeling.class));
        cards.add(new SetCardInfo("Mudbutton Clanger", 95, Rarity.COMMON, mage.cards.m.MudbuttonClanger.class));
        cards.add(new SetCardInfo("Murmuring Bosk", 147, Rarity.RARE, mage.cards.m.MurmuringBosk.class));
        cards.add(new SetCardInfo("Mutavault", 148, Rarity.RARE, mage.cards.m.Mutavault.class));
        cards.add(new SetCardInfo("Negate", 43, Rarity.COMMON, mage.cards.n.Negate.class));
        cards.add(new SetCardInfo("Nevermaker", 44, Rarity.UNCOMMON, mage.cards.n.Nevermaker.class));
        cards.add(new SetCardInfo("Nightshade Schemers", 69, Rarity.UNCOMMON, mage.cards.n.NightshadeSchemers.class));
        cards.add(new SetCardInfo("Noggin Whack", 70, Rarity.UNCOMMON, mage.cards.n.NogginWhack.class));
        cards.add(new SetCardInfo("Notorious Throng", 45, Rarity.RARE, mage.cards.n.NotoriousThrong.class));
        cards.add(new SetCardInfo("Obsidian Battle-Axe", 144, Rarity.UNCOMMON, mage.cards.o.ObsidianBattleAxe.class));
        cards.add(new SetCardInfo("Offalsnout", 71, Rarity.UNCOMMON, mage.cards.o.Offalsnout.class));
        cards.add(new SetCardInfo("Oona's Blackguard", 72, Rarity.UNCOMMON, mage.cards.o.OonasBlackguard.class));
        cards.add(new SetCardInfo("Orchard Warden", 131, Rarity.UNCOMMON, mage.cards.o.OrchardWarden.class));
        cards.add(new SetCardInfo("Order of the Golden Cricket", 19, Rarity.COMMON, mage.cards.o.OrderOfTheGoldenCricket.class));
        cards.add(new SetCardInfo("Pack's Disdain", 73, Rarity.COMMON, mage.cards.p.PacksDisdain.class));
        cards.add(new SetCardInfo("Preeminent Captain", 20, Rarity.RARE, mage.cards.p.PreeminentCaptain.class));
        cards.add(new SetCardInfo("Prickly Boggart", 74, Rarity.COMMON, mage.cards.p.PricklyBoggart.class));
        cards.add(new SetCardInfo("Primal Beyond", 149, Rarity.RARE, mage.cards.p.PrimalBeyond.class));
        cards.add(new SetCardInfo("Pulling Teeth", 75, Rarity.COMMON, mage.cards.p.PullingTeeth.class));
        cards.add(new SetCardInfo("Pyroclast Consul", 96, Rarity.UNCOMMON, mage.cards.p.PyroclastConsul.class));
        cards.add(new SetCardInfo("Rage Forger", 97, Rarity.UNCOMMON, mage.cards.r.RageForger.class));
        cards.add(new SetCardInfo("Reach of Branches", 132, Rarity.RARE, mage.cards.r.ReachOfBranches.class));
        cards.add(new SetCardInfo("Recross the Paths", 133, Rarity.UNCOMMON, mage.cards.r.RecrossThePaths.class));
        cards.add(new SetCardInfo("Redeem the Lost", 21, Rarity.UNCOMMON, mage.cards.r.RedeemTheLost.class));
        cards.add(new SetCardInfo("Reins of the Vinesteed", 134, Rarity.COMMON, mage.cards.r.ReinsOfTheVinesteed.class));
        cards.add(new SetCardInfo("Release the Ants", 98, Rarity.UNCOMMON, mage.cards.r.ReleaseTheAnts.class));
        cards.add(new SetCardInfo("Research the Deep", 46, Rarity.UNCOMMON, mage.cards.r.ResearchTheDeep.class));
        cards.add(new SetCardInfo("Reveillark", 22, Rarity.RARE, mage.cards.r.Reveillark.class));
        cards.add(new SetCardInfo("Revive the Fallen", 76, Rarity.UNCOMMON, mage.cards.r.ReviveTheFallen.class));
        cards.add(new SetCardInfo("Rhys the Exiled", 135, Rarity.RARE, mage.cards.r.RhysTheExiled.class));
        cards.add(new SetCardInfo("Rivals' Duel", 99, Rarity.UNCOMMON, mage.cards.r.RivalsDuel.class));
        cards.add(new SetCardInfo("Roar of the Crowd", 100, Rarity.COMMON, mage.cards.r.RoarOfTheCrowd.class));
        cards.add(new SetCardInfo("Rustic Clachan", 150, Rarity.RARE, mage.cards.r.RusticClachan.class));
        cards.add(new SetCardInfo("Sage of Fables", 47, Rarity.UNCOMMON, mage.cards.s.SageOfFables.class));
        cards.add(new SetCardInfo("Sage's Dousing", 48, Rarity.UNCOMMON, mage.cards.s.SagesDousing.class));
        cards.add(new SetCardInfo("Scapeshift", 136, Rarity.RARE, mage.cards.s.Scapeshift.class));
        cards.add(new SetCardInfo("Scarblade Elite", 77, Rarity.RARE, mage.cards.s.ScarbladeElite.class));
        cards.add(new SetCardInfo("Seething Pathblazer", 101, Rarity.COMMON, mage.cards.s.SeethingPathblazer.class));
        cards.add(new SetCardInfo("Sensation Gorger", 102, Rarity.RARE, mage.cards.s.SensationGorger.class));
        cards.add(new SetCardInfo("Shard Volley", 103, Rarity.COMMON, mage.cards.s.ShardVolley.class));
        cards.add(new SetCardInfo("Shared Animosity", 104, Rarity.RARE, mage.cards.s.SharedAnimosity.class));
        cards.add(new SetCardInfo("Shinewend", 23, Rarity.COMMON, mage.cards.s.Shinewend.class));
        cards.add(new SetCardInfo("Sigil Tracer", 49, Rarity.RARE, mage.cards.s.SigilTracer.class));
        cards.add(new SetCardInfo("Slithermuse", 50, Rarity.RARE, mage.cards.s.Slithermuse.class));
        cards.add(new SetCardInfo("Spitebellows", 105, Rarity.UNCOMMON, mage.cards.s.Spitebellows.class));
        cards.add(new SetCardInfo("Squeaking Pie Grubfellows", 78, Rarity.COMMON, mage.cards.s.SqueakingPieGrubfellows.class));
        cards.add(new SetCardInfo("Stenchskipper", 79, Rarity.RARE, mage.cards.s.Stenchskipper.class));
        cards.add(new SetCardInfo("Stingmoggie", 106, Rarity.COMMON, mage.cards.s.Stingmoggie.class));
        cards.add(new SetCardInfo("Stinkdrinker Bandit", 80, Rarity.UNCOMMON, mage.cards.s.StinkdrinkerBandit.class));
        cards.add(new SetCardInfo("Stomping Slabs", 107, Rarity.UNCOMMON, mage.cards.s.StompingSlabs.class));
        cards.add(new SetCardInfo("Stonehewer Giant", 24, Rarity.RARE, mage.cards.s.StonehewerGiant.class));
        cards.add(new SetCardInfo("Stonybrook Banneret", 51, Rarity.COMMON, mage.cards.s.StonybrookBanneret.class));
        cards.add(new SetCardInfo("Stonybrook Schoolmaster", 25, Rarity.COMMON, mage.cards.s.StonybrookSchoolmaster.class));
        cards.add(new SetCardInfo("Stream of Unconsciousness", 52, Rarity.COMMON, mage.cards.s.StreamOfUnconsciousness.class));
        cards.add(new SetCardInfo("Sunflare Shaman", 108, Rarity.COMMON, mage.cards.s.SunflareShaman.class));
        cards.add(new SetCardInfo("Supreme Exemplar", 53, Rarity.RARE, mage.cards.s.SupremeExemplar.class));
        cards.add(new SetCardInfo("Swell of Courage", 26, Rarity.UNCOMMON, mage.cards.s.SwellOfCourage.class));
        cards.add(new SetCardInfo("Taurean Mauler", 109, Rarity.RARE, mage.cards.t.TaureanMauler.class));
        cards.add(new SetCardInfo("Thieves' Fortune", 54, Rarity.UNCOMMON, mage.cards.t.ThievesFortune.class));
        cards.add(new SetCardInfo("Thornbite Staff", 145, Rarity.UNCOMMON, mage.cards.t.ThornbiteStaff.class));
        cards.add(new SetCardInfo("Titan's Revenge", 110, Rarity.RARE, mage.cards.t.TitansRevenge.class));
        cards.add(new SetCardInfo("Unstoppable Ash", 137, Rarity.RARE, mage.cards.u.UnstoppableAsh.class));
        cards.add(new SetCardInfo("Vendilion Clique", 55, Rarity.RARE, mage.cards.v.VendilionClique.class));
        cards.add(new SetCardInfo("Vengeful Firebrand", 111, Rarity.RARE, mage.cards.v.VengefulFirebrand.class));
        cards.add(new SetCardInfo("Veteran's Armaments", 146, Rarity.UNCOMMON, mage.cards.v.VeteransArmaments.class));
        cards.add(new SetCardInfo("Violet Pall", 81, Rarity.COMMON, mage.cards.v.VioletPall.class));
        cards.add(new SetCardInfo("Walker of the Grove", 138, Rarity.UNCOMMON, mage.cards.w.WalkerOfTheGrove.class));
        cards.add(new SetCardInfo("Wandering Graybeard", 27, Rarity.UNCOMMON, mage.cards.w.WanderingGraybeard.class));
        cards.add(new SetCardInfo("Warren Weirding", 82, Rarity.UNCOMMON, mage.cards.w.WarrenWeirding.class));
        cards.add(new SetCardInfo("War-Spike Changeling", 112, Rarity.COMMON, mage.cards.w.WarSpikeChangeling.class));
        cards.add(new SetCardInfo("Waterspout Weavers", 56, Rarity.UNCOMMON, mage.cards.w.WaterspoutWeavers.class));
        cards.add(new SetCardInfo("Weed-Pruner Poplar", 83, Rarity.COMMON, mage.cards.w.WeedPrunerPoplar.class));
        cards.add(new SetCardInfo("Weight of Conscience", 28, Rarity.COMMON, mage.cards.w.WeightOfConscience.class));
        cards.add(new SetCardInfo("Weirding Shaman", 84, Rarity.RARE, mage.cards.w.WeirdingShaman.class));
        cards.add(new SetCardInfo("Winnower Patrol", 139, Rarity.COMMON, mage.cards.w.WinnowerPatrol.class));
        cards.add(new SetCardInfo("Wolf-Skull Shaman", 140, Rarity.UNCOMMON, mage.cards.w.WolfSkullShaman.class));
    }
}

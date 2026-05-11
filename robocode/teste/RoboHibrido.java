package teste;
import robocode.*;
import robocode.util.Utils;

public class RoboHibrido extends AdvancedRobot {

    public void run() {
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);
        setAdjustRadarForGunTurn(true);

        while (true) {
            setTurnRadarRight(360);
            setAhead(200);
            setTurnRight(60);
            execute();
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        double radarTurn = getHeadingRadians() + e.getBearingRadians() - getRadarHeadingRadians();
        setTurnRadarRightRadians(2 * Utils.normalRelativeAngle(radarTurn));

        double gunTurn = getHeadingRadians() + e.getBearingRadians() - getGunHeadingRadians();
        setTurnGunRightRadians(Utils.normalRelativeAngle(gunTurn));

        if (e.getDistance() > 250) {
            setAhead(150);
            fire(2);
        } else if (e.getDistance() > 100) {
            setTurnRight(e.getBearing() + 90);
            setAhead(120);
            fire(3);
        } else {
            setBack(80);
            setTurnRight(90);
            fire(3);
        }
    }

    public void onHitByBullet(HitByBulletEvent e) {
        setTurnRight(90 - e.getBearing());
        setAhead(150);
    }

    public void onHitWall(HitWallEvent e) {
        back(150);
        turnRight(120);
    }

    public void onHitRobot(HitRobotEvent e) {
        if (e.isMyFault()) {
            back(100);
        }
        fire(3);
    }

    public void onWin(WinEvent e) {
        while (true) {
            turnRight(30);
            turnLeft(30);
        }
    }
}
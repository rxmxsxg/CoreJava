public class MaxVersionFinding {

    static String maxVersion(String version1,String version2){
        String[] v1Component = version1.split("\\.");
        String[] v2Component = version2.split("\\.");
        int maxLenth = Math.max(v1Component.length,v2Component.length);
        for(int i=0; i<maxLenth; i++){
            int ver1 = (i<v1Component.length)? Integer.parseInt(v1Component[i]):0;
            int ver2 = (i<v2Component.length)? Integer.parseInt(v2Component[i]):0;
            if(ver1 > ver2 ){
                return version1;
            } else if(ver1 < ver2){
                return version2;
            }

        }
        return version1;
    }
    public static void main(String[] args){
        String v1 = "1.2.4.6";
        String v2 = "1.2.4.6.12";
        String maxv = maxVersion(v1,v2);
        System.out.println(maxv);
    }
}

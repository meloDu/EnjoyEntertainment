package com.smart.melo.enjoyentertainment.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by melo on 2017/3/7.
 */
public class VideoBean {

    /**
     * appclassid : 609
     * updateTime : 1488867048
     * title : 热门视频
     * titlepic :
     * sharepic :
     * descpic :
     * icon : http://p3.img.kksmg.com/image/2017/01/18/21c2480112dc3a18e4d3020037f90133.png
     * icon1 :
     * icon2 : http://p3.img.kksmg.com/image/2017/01/18/21c2480112dc3a18e4d3020037f90133.png
     * intro :
     * description :
     * num : 0
     * share_url : http://m.kankanews.com/column/609
     * knews24 : http://bililive.kksmg.com/hls/knews_live/playlist.m3u8
     * knews24_bak : http://hls.live.kksmg.com/live/live24h3/playlist.m3u8
     * knews24_now : Knews24
     * knews24_time : 13:00-18:00
     * category : list
     * list : [{"id":"148911","o_cmsid":"7906421","o_classid":"8302","title":"暖心2017丨跨过重度听力障碍成当红女主播","titlepic":"http://p3.img.kksmg.com/image/2017/03/07/b2f1939cdb84126e360a0563709aacef.jpg","newstime":"1488865462","titleurl":"http://m.kankanews.com/n/1_7906421.html","type":"video","labels":"","keyboard":{"text":"正能量","color":"#fea740"},"intro":"蕾欧娜\u2014\u2014\u201c永远18岁\u201d的直播平台女主播，笑容可爱，能唱能跳，拥有10万多微博粉丝；然而真实生活中的她是后天听力障碍者，她几乎听不到声音，只能靠助听器听到非常模糊的单音。","newsdate":"2017-03-07","icon":"","icontype":1,"sharepic":"http://p3.img.kksmg.com/image/2016/05/26/843c2f55d863a59196e7f6c10a2c53d7.jpg","onclick":0,"videourl":"http://domhttp.kksmg.com/2017/03/07/h264_450k_mp4_a32ea86f1b087b5e04f9bed50dab75af_ncm.mp4","filelength":"6'51''","journalist":[]},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{},{}]
     * code : 201
     * subinfo : 0
     */

    private String appclassid;
    private int updateTime;
    private String title;
    private String titlepic;
    private String sharepic;
    private String descpic;
    private String icon;
    private String icon1;
    private String icon2;
    private String intro;
    private String description;
    private int num;
    private String share_url;
    private String knews24;
    private String knews24_bak;
    private String knews24_now;
    private String knews24_time;
    private String category;
    private int code;
    private int subinfo;
    private List<ListBean> list;

    public String getAppclassid() {
        return appclassid;
    }

    public void setAppclassid(String appclassid) {
        this.appclassid = appclassid;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitlepic() {
        return titlepic;
    }

    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic;
    }

    public String getSharepic() {
        return sharepic;
    }

    public void setSharepic(String sharepic) {
        this.sharepic = sharepic;
    }

    public String getDescpic() {
        return descpic;
    }

    public void setDescpic(String descpic) {
        this.descpic = descpic;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon1() {
        return icon1;
    }

    public void setIcon1(String icon1) {
        this.icon1 = icon1;
    }

    public String getIcon2() {
        return icon2;
    }

    public void setIcon2(String icon2) {
        this.icon2 = icon2;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getKnews24() {
        return knews24;
    }

    public void setKnews24(String knews24) {
        this.knews24 = knews24;
    }

    public String getKnews24_bak() {
        return knews24_bak;
    }

    public void setKnews24_bak(String knews24_bak) {
        this.knews24_bak = knews24_bak;
    }

    public String getKnews24_now() {
        return knews24_now;
    }

    public void setKnews24_now(String knews24_now) {
        this.knews24_now = knews24_now;
    }

    public String getKnews24_time() {
        return knews24_time;
    }

    public void setKnews24_time(String knews24_time) {
        this.knews24_time = knews24_time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSubinfo() {
        return subinfo;
    }

    public void setSubinfo(int subinfo) {
        this.subinfo = subinfo;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean implements Serializable{
        /**
         * id : 148911
         * o_cmsid : 7906421
         * o_classid : 8302
         * title : 暖心2017丨跨过重度听力障碍成当红女主播
         * titlepic : http://p3.img.kksmg.com/image/2017/03/07/b2f1939cdb84126e360a0563709aacef.jpg
         * newstime : 1488865462
         * titleurl : http://m.kankanews.com/n/1_7906421.html
         * type : video
         * labels :
         * keyboard : {"text":"正能量","color":"#fea740"}
         * intro : 蕾欧娜——“永远18岁”的直播平台女主播，笑容可爱，能唱能跳，拥有10万多微博粉丝；然而真实生活中的她是后天听力障碍者，她几乎听不到声音，只能靠助听器听到非常模糊的单音。
         * newsdate : 2017-03-07
         * icon :
         * icontype : 1
         * sharepic : http://p3.img.kksmg.com/image/2016/05/26/843c2f55d863a59196e7f6c10a2c53d7.jpg
         * onclick : 0
         * videourl : http://domhttp.kksmg.com/2017/03/07/h264_450k_mp4_a32ea86f1b087b5e04f9bed50dab75af_ncm.mp4
         * filelength : 6'51''
         * journalist : []
         */

        private String id;
        private String o_cmsid;
        private String o_classid;
        private String title;
        private String titlepic;
        private String newstime;
        private String titleurl;
        private String type;
        private String labels;
        private KeyboardBean keyboard;
        private String intro;
        private String newsdate;
        private String icon;
        private int icontype;
        private String sharepic;
        private int onclick;
        private String videourl;
        private String filelength;
        private List<?> journalist;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getO_cmsid() {
            return o_cmsid;
        }

        public void setO_cmsid(String o_cmsid) {
            this.o_cmsid = o_cmsid;
        }

        public String getO_classid() {
            return o_classid;
        }

        public void setO_classid(String o_classid) {
            this.o_classid = o_classid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitlepic() {
            return titlepic;
        }

        public void setTitlepic(String titlepic) {
            this.titlepic = titlepic;
        }

        public String getNewstime() {
            return newstime;
        }

        public void setNewstime(String newstime) {
            this.newstime = newstime;
        }

        public String getTitleurl() {
            return titleurl;
        }

        public void setTitleurl(String titleurl) {
            this.titleurl = titleurl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLabels() {
            return labels;
        }

        public void setLabels(String labels) {
            this.labels = labels;
        }

        public KeyboardBean getKeyboard() {
            return keyboard;
        }

        public void setKeyboard(KeyboardBean keyboard) {
            this.keyboard = keyboard;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getNewsdate() {
            return newsdate;
        }

        public void setNewsdate(String newsdate) {
            this.newsdate = newsdate;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getIcontype() {
            return icontype;
        }

        public void setIcontype(int icontype) {
            this.icontype = icontype;
        }

        public String getSharepic() {
            return sharepic;
        }

        public void setSharepic(String sharepic) {
            this.sharepic = sharepic;
        }

        public int getOnclick() {
            return onclick;
        }

        public void setOnclick(int onclick) {
            this.onclick = onclick;
        }

        public String getVideourl() {
            return videourl;
        }

        public void setVideourl(String videourl) {
            this.videourl = videourl;
        }

        public String getFilelength() {
            return filelength;
        }

        public void setFilelength(String filelength) {
            this.filelength = filelength;
        }

        public List<?> getJournalist() {
            return journalist;
        }

        public void setJournalist(List<?> journalist) {
            this.journalist = journalist;
        }

        public static class KeyboardBean {
            /**
             * text : 正能量
             * color : #fea740
             */

            private String text;
            private String color;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }
        }
    }
}

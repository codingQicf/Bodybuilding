//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    url:'http://localhost:90/',
    current: 'homepage',

//========================轮播图==图片============================
    imgUrls: [
      {
        //link: '/pages/index/index',
        url: 'https://img.zcool.cn/community/013aa55ab4ab03a80120be14c17b2c.jpg@1280w_1l_2o_100sh.jpg'
      }, {
        //link: '/pages/logs/logs',
        url: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1548740605413&di=0667580ffe117f85728c562d048b52d3&imgtype=0&src=http%3A%2F%2Fpic1.16pic.com%2F00%2F51%2F95%2F16pic_5195391_b.jpg'
      }, {
        //link: '/pages/index/index',
        url: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1549335346&di=6aefa918f196bcf731a5989086ebcbe3&imgtype=jpg&er=1&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F57babb591fcc5.jpg'
      }
    ],
    indicatorDots: true,  //小点
    autoplay: true,  //是否自动轮播
    interval: 3000,  //间隔时间
    duration: 3000,  //滑动时间
  },
  //事件处理函数
  bindViewTap: function() {
   
  },

  onLoad(){
    

    console.log('[你当前获取主页信息列表]')

    wx.request({
      url: this.data.url + '2002',
      data: {
      },
      method: "GET",
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res)
        
      }
    })

    wx.request({
      url: this.data.url + '2002',
      data: {
      },
      method: "GET",
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res)

      }
    })


  },
  handleChange({ detail }) {
    this.setData({
      current: detail.key
    });
    //项目
    if (detail.key=="project"){
      wx.navigateTo({
        url: '/pages/index/project/project',
      })
    }
    //教练
    if (detail.key == "teacher") {
      wx.navigateTo({
        url: '/pages/index/teacher/teacher',
      })
    }
    //我的
    if (detail.key == "me") {
      wx.navigateTo({
        url: '/pages/index/me/me',
      })
    }
    //资讯
    if (detail.key == "news") {
      wx.navigateTo({
        url: '/pages/index/news/news',
      })
    }

  },
})

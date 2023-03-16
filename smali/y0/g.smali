.class public Ly0/g;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ly0/z1;Ljava/lang/Boolean;)Ljava/lang/String;
    .locals 5

    invoke-static {}, Ly0/u;->c()Ly0/u;

    move-result-object v0

    invoke-virtual {p0}, Ly0/z1;->n()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    const-string v1, "session == null"

    invoke-static {p0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->d()Ly0/c3;

    move-result-object v1

    const-string v2, "session.getDevice() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->a()Ly0/l0;

    move-result-object v1

    const-string v2, "session.getApplicationVersion() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->c()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "session.getBatteryLevel() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "session.getFreeRam() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->n()Ljava/util/Date;

    move-result-object v1

    const-string v2, "session.getTime() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "session.getOsVersion() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->f()Ljava/lang/String;

    move-result-object v1

    const-string v2, "session.getLanguage() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->o()Ljava/lang/String;

    move-result-object v1

    const-string v2, "session.getTimezone() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "session.getTotalRam() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "session.getRamUsed() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "session.getOrientation() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->k()Ljava/lang/String;

    move-result-object v1

    const-string v2, "session.getSdkType() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/z1;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "session.getSessionIdentifier() == null"

    invoke-static {v1, v2}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "device"

    invoke-virtual {p0}, Ly0/z1;->d()Ly0/c3;

    move-result-object v3

    invoke-static {v3}, Ly0/g;->d(Ly0/c3;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "app_version"

    invoke-virtual {p0}, Ly0/z1;->a()Ly0/l0;

    move-result-object v3

    invoke-static {v3}, Ly0/g;->c(Ly0/l0;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "battery_level"

    invoke-virtual {p0}, Ly0/z1;->c()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v2, "ram_free"

    invoke-virtual {p0}, Ly0/z1;->e()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "time"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "os_version"

    invoke-virtual {p0}, Ly0/z1;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "language"

    invoke-virtual {p0}, Ly0/z1;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "timezone"

    invoke-virtual {p0}, Ly0/z1;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "ram_total"

    invoke-virtual {p0}, Ly0/z1;->p()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "ram_used"

    invoke-virtual {p0}, Ly0/z1;->j()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v0, "orientation"

    invoke-virtual {p0}, Ly0/z1;->h()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "sdk_type"

    invoke-virtual {p0}, Ly0/z1;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "session_uid"

    invoke-virtual {p0}, Ly0/z1;->m()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "will_resend"

    const/4 p1, 0x1

    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-static {p0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static b(Ly0/g0;)Lorg/json/JSONObject;
    .locals 2

    :try_start_0
    const-string v0, "application == null"

    invoke-static {p0, v0}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/g0;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "application.getKey() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "key"

    invoke-virtual {p0}, Ly0/g0;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    invoke-static {p0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static c(Ly0/l0;)Lorg/json/JSONObject;
    .locals 3

    :try_start_0
    const-string v0, "applicationVersion == null"

    invoke-static {p0, v0}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/l0;->a()Ly0/g0;

    move-result-object v0

    const-string v1, "applicationVersion.getApplication() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/l0;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "applicationVersion.getVersionName() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/l0;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "applicationVersion.getVersionCode() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "app"

    invoke-virtual {p0}, Ly0/l0;->a()Ly0/g0;

    move-result-object v2

    invoke-static {v2}, Ly0/g;->b(Ly0/g0;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "version"

    invoke-virtual {p0}, Ly0/l0;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "build"

    invoke-virtual {p0}, Ly0/l0;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    invoke-static {p0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static d(Ly0/c3;)Lorg/json/JSONObject;
    .locals 3

    :try_start_0
    const-string v0, "device == null"

    invoke-static {p0, v0}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/c3;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device.getUdid() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/c3;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device.getName() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ly0/c3;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device.getDeviceType() == null"

    invoke-static {v0, v1}, Ly0/l3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "udid"

    invoke-virtual {p0}, Ly0/c3;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "name"

    invoke-virtual {p0}, Ly0/c3;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "device_type"

    invoke-virtual {p0}, Ly0/c3;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    invoke-static {p0}, Ly0/i0;->c(Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

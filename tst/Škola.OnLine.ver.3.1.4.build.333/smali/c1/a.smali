.class public Lc1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Lt8/k$c;
.implements Ll8/a;


# instance fields
.field private n:Landroid/content/Context;

.field private o:Landroid/app/Activity;

.field private p:Ll8/c;

.field private q:Lt8/k$d;

.field private final r:Lt8/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc1/a$a;

    invoke-direct {v0, p0}, Lc1/a$a;-><init>(Lc1/a;)V

    iput-object v0, p0, Lc1/a;->r:Lt8/m;

    return-void
.end method

.method static synthetic a(Lc1/a;)Lt8/k$d;
    .locals 0

    iget-object p0, p0, Lc1/a;->q:Lt8/k$d;

    return-object p0
.end method

.method private b(Ll8/c;)V
    .locals 1

    iget-object v0, p0, Lc1/a;->r:Lt8/m;

    invoke-interface {p1, v0}, Ll8/c;->b(Lt8/m;)V

    iput-object p1, p0, Lc1/a;->p:Ll8/c;

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lc1/a;->p:Ll8/c;

    iget-object v1, p0, Lc1/a;->r:Lt8/m;

    invoke-interface {v0, v1}, Ll8/c;->d(Lt8/m;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lc1/a;->p:Ll8/c;

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ll8/c;)V
    .locals 1

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lc1/a;->o:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lc1/a;->b(Ll8/c;)V

    return-void
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 3

    new-instance v0, Lt8/k;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object v1

    const-string v2, "flutter_bugfender"

    invoke-direct {v0, v1, v2}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lt8/k;->e(Lt8/k$c;)V

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc1/a;->n:Landroid/content/Context;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc1/a;->o:Landroid/app/Activity;

    invoke-direct {p0}, Lc1/a;->c()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc1/a;->o:Landroid/app/Activity;

    invoke-direct {p0}, Lc1/a;->c()V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lc1/a;->n:Landroid/content/Context;

    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v1, Lt8/j;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v5, "setDeviceString"

    const-string v6, "setDeviceInt"

    const-string v7, "setDeviceBool"

    const-string v8, "setDeviceFloat"

    const-string v9, "trace"

    const-string v10, "fatal"

    const-string v11, "error"

    const-string v12, "sendIssue"

    const-string v13, "warn"

    const-string v15, "info"

    const-string v14, "sendCrash"

    const-string v0, "sendUserFeedback"

    const/16 v16, 0x3

    const/16 v17, 0x2

    const/16 v18, 0x1

    const/16 v19, -0x1

    sparse-switch v4, :sswitch_data_0

    :goto_0
    move/from16 v3, v19

    goto/16 :goto_1

    :sswitch_0
    const-string v4, "removeDeviceKey"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x15

    goto/16 :goto_1

    :sswitch_1
    const-string v4, "sendLog"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0x14

    goto/16 :goto_1

    :sswitch_2
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/16 v3, 0x13

    goto/16 :goto_1

    :sswitch_3
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/16 v3, 0x12

    goto/16 :goto_1

    :sswitch_4
    const-string v4, "setForceEnabled"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/16 v3, 0x11

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "getSessionUri"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const/16 v3, 0x10

    goto/16 :goto_1

    :sswitch_6
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const/16 v3, 0xf

    goto/16 :goto_1

    :sswitch_7
    const-string v4, "getUserFeedback"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_0

    :cond_7
    const/16 v3, 0xe

    goto/16 :goto_1

    :sswitch_8
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_0

    :cond_8
    const/16 v3, 0xd

    goto/16 :goto_1

    :sswitch_9
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_0

    :cond_9
    const/16 v3, 0xc

    goto/16 :goto_1

    :sswitch_a
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0xb

    goto/16 :goto_1

    :sswitch_b
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0xa

    goto/16 :goto_1

    :sswitch_c
    const-string v4, "debug"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x9

    goto/16 :goto_1

    :sswitch_d
    const-string v4, "getDeviceUri"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0x8

    goto :goto_1

    :sswitch_e
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto/16 :goto_0

    :cond_e
    const/4 v3, 0x7

    goto :goto_1

    :sswitch_f
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto/16 :goto_0

    :cond_f
    const/4 v3, 0x6

    goto :goto_1

    :sswitch_10
    const-string v4, "init"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto/16 :goto_0

    :cond_10
    const/4 v3, 0x5

    goto :goto_1

    :sswitch_11
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto/16 :goto_0

    :cond_11
    const/4 v3, 0x4

    goto :goto_1

    :sswitch_12
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto/16 :goto_0

    :cond_12
    move/from16 v3, v16

    goto :goto_1

    :sswitch_13
    const-string v4, "log"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto/16 :goto_0

    :cond_13
    move/from16 v3, v17

    goto :goto_1

    :sswitch_14
    const-string v4, "forceSendOnce"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    goto/16 :goto_0

    :cond_14
    move/from16 v3, v18

    goto :goto_1

    :sswitch_15
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    goto/16 :goto_0

    :cond_15
    const/4 v3, 0x0

    :goto_1
    const-string v4, "title"

    const-string v1, "value"

    move-object/from16 v20, v0

    const-string v0, ""

    packed-switch v3, :pswitch_data_0

    invoke-interface/range {p2 .. p2}, Lt8/k$d;->c()V

    goto/16 :goto_c

    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ld1/a;->u(Ljava/lang/String;)V

    :cond_16
    :goto_2
    const/4 v0, 0x0

    :goto_3
    invoke-interface {v2, v0}, Lt8/k$d;->a(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    const-string v0, "line"

    move-object/from16 v3, p1

    invoke-virtual {v3, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "method"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    const-string v1, "file"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    const-string v1, "level"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {}, Ld1/b;->values()[Ld1/b;

    move-result-object v6

    aget-object v6, v6, v1

    const-string v1, "tag"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    const-string v1, "text"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    move v3, v0

    invoke-static/range {v3 .. v8}, Ld1/a;->s(ILjava/lang/String;Ljava/lang/String;Ld1/b;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :pswitch_2
    move-object/from16 v3, p1

    const/4 v0, 0x0

    invoke-virtual/range {p1 .. p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Ld1/a;->E(Z)V

    goto :goto_3

    :pswitch_3
    invoke-static {}, Ld1/a;->k()Ljava/net/URL;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_4
    move-object/from16 v3, p1

    invoke-virtual {v3, v4}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "hint"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    const-string v1, "subjectHint"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    const-string v1, "messageHint"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    const-string v1, "sendButtonText"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    move-object/from16 v12, p0

    iput-object v2, v12, Lc1/a;->q:Lt8/k$d;

    iget-object v8, v12, Lc1/a;->o:Landroid/app/Activity;

    const/4 v9, 0x0

    move-object v1, v8

    move-object v2, v0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v9

    invoke-static/range {v1 .. v7}, Ld1/a;->l(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bugfender/sdk/ui/a;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x255c

    invoke-virtual {v8, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_c

    :pswitch_5
    move-object/from16 v12, p0

    move-object/from16 v3, p1

    const/4 v4, 0x0

    const-string v0, "key"

    invoke-virtual {v3, v0}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v9, v3, Lt8/j;->a:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_1

    :goto_4
    move/from16 v16, v19

    goto :goto_5

    :sswitch_16
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_4

    :sswitch_17
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    goto :goto_4

    :cond_17
    move/from16 v16, v17

    goto :goto_5

    :sswitch_18
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto :goto_4

    :cond_18
    move/from16 v16, v18

    goto :goto_5

    :sswitch_19
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    goto :goto_4

    :cond_19
    move/from16 v16, v4

    :cond_1a
    :goto_5
    packed-switch v16, :pswitch_data_1

    :goto_6
    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Ld1/a;->D(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :pswitch_7
    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ld1/a;->C(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_6

    :pswitch_8
    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v0, v1}, Ld1/a;->A(Ljava/lang/String;Z)V

    goto :goto_6

    :pswitch_9
    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    double-to-float v1, v3

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v0, v1}, Ld1/a;->B(Ljava/lang/String;Ljava/lang/Float;)V

    goto :goto_6

    :pswitch_a
    move-object/from16 v12, p0

    invoke-static {}, Ld1/a;->i()Ljava/net/URL;

    move-result-object v0

    :goto_7
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    :pswitch_b
    move-object/from16 v12, p0

    move-object/from16 v3, p1

    const/4 v4, 0x0

    const-string v1, "appKey"

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v5, "apiUri"

    invoke-virtual {v3, v5}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "baseUri"

    invoke-virtual {v3, v6}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "maximumLocalStorageSize"

    invoke-virtual {v3, v7}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const-string v8, "printToConsole"

    invoke-virtual {v3, v8}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const-string v9, "enableUIEventLogging"

    invoke-virtual {v3, v9}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const-string v10, "enableCrashReporting"

    invoke-virtual {v3, v10}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    const-string v11, "enableAndroidLogcatLogging"

    invoke-virtual {v3, v11}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const-string v13, "overrideDeviceName"

    invoke-virtual {v3, v13}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1b

    invoke-static {v3}, Ld1/a;->t(Ljava/lang/String;)V

    :cond_1b
    invoke-static {v5, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    invoke-static {v5}, Ld1/a;->y(Ljava/lang/String;)V

    :cond_1c
    invoke-static {v6, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-static {v6}, Ld1/a;->z(Ljava/lang/String;)V

    :cond_1d
    iget-object v0, v12, Lc1/a;->n:Landroid/content/Context;

    invoke-static {v0, v1, v8}, Ld1/a;->n(Landroid/content/Context;Ljava/lang/String;Z)V

    if-eqz v11, :cond_1e

    invoke-static {}, Ld1/a;->d()V

    :cond_1e
    if-eqz v9, :cond_1f

    iget-object v0, v12, Lc1/a;->n:Landroid/content/Context;

    check-cast v0, Landroid/app/Application;

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ld1/a;->f(Landroid/app/Application;[Ljava/lang/Object;)V

    :cond_1f
    if-eqz v10, :cond_20

    invoke-static {}, Ld1/a;->c()V

    :cond_20
    if-eqz v7, :cond_16

    int-to-long v0, v7

    invoke-static {v0, v1}, Ld1/a;->F(J)V

    goto/16 :goto_2

    :pswitch_c
    move-object/from16 v12, p0

    move-object/from16 v3, p1

    const/4 v4, 0x0

    invoke-virtual/range {p1 .. p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, v3, Lt8/j;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_2

    :goto_8
    move/from16 v14, v19

    goto :goto_9

    :sswitch_1a
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    goto :goto_8

    :cond_21
    const/4 v14, 0x4

    goto :goto_9

    :sswitch_1b
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_8

    :cond_22
    move/from16 v14, v16

    goto :goto_9

    :sswitch_1c
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    goto :goto_8

    :cond_23
    move/from16 v14, v17

    goto :goto_9

    :sswitch_1d
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    goto :goto_8

    :cond_24
    move/from16 v14, v18

    goto :goto_9

    :sswitch_1e
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    goto :goto_8

    :cond_25
    move v14, v4

    :goto_9
    packed-switch v14, :pswitch_data_2

    invoke-static {v0, v1}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_d
    invoke-static {v0, v1}, Ld1/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_e
    invoke-static {v0, v1}, Ld1/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_f
    invoke-static {v0, v1}, Ld1/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_10
    invoke-static {v0, v1}, Ld1/a;->J(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_11
    invoke-static {v0, v1}, Ld1/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_12
    move-object/from16 v12, p0

    const/4 v0, 0x0

    invoke-static {}, Ld1/a;->h()V

    goto/16 :goto_3

    :pswitch_13
    move-object/from16 v3, p1

    move-object/from16 v5, v20

    const/4 v0, 0x0

    const/4 v6, 0x0

    invoke-virtual {v3, v4}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v1}, Lt8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, v3, Lt8/j;->a:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_3

    :goto_a
    move/from16 v17, v19

    goto :goto_b

    :sswitch_1f
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    goto :goto_a

    :sswitch_20
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    goto :goto_a

    :cond_26
    move/from16 v17, v18

    goto :goto_b

    :sswitch_21
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    goto :goto_a

    :cond_27
    move/from16 v17, v6

    :cond_28
    :goto_b
    packed-switch v17, :pswitch_data_3

    goto/16 :goto_7

    :pswitch_14
    invoke-static {v4, v1}, Ld1/a;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_15
    invoke-static {v4, v1}, Ld1/a;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    goto/16 :goto_7

    :pswitch_16
    invoke-static {v4, v1}, Ld1/a;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;

    move-result-object v0

    goto/16 :goto_7

    :goto_c
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x2ed1a7e8 -> :sswitch_15
        -0xe53cdcc -> :sswitch_14
        0x1a344 -> :sswitch_13
        0xc18ff -> :sswitch_12
        0x3164ae -> :sswitch_11
        0x316510 -> :sswitch_10
        0x379286 -> :sswitch_f
        0x615e31 -> :sswitch_e
        0xedf880 -> :sswitch_d
        0x5b09653 -> :sswitch_c
        0x5c4d208 -> :sswitch_b
        0x5cb3504 -> :sswitch_a
        0x697f145 -> :sswitch_9
        0x12e153e4 -> :sswitch_8
        0x27c2d2e6 -> :sswitch_7
        0x4aecb862 -> :sswitch_6
        0x514e72ec -> :sswitch_5
        0x55771758 -> :sswitch_4
        0x5d418b77 -> :sswitch_3
        0x5fea5f89 -> :sswitch_2
        0x7602ce9c -> :sswitch_1
        0x7f5cdc05 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_c
        :pswitch_13
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_13
        :pswitch_a
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x12e153e4 -> :sswitch_19
        0x4aecb862 -> :sswitch_18
        0x5d418b77 -> :sswitch_17
        0x5fea5f89 -> :sswitch_16
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x3164ae -> :sswitch_1e
        0x379286 -> :sswitch_1d
        0x5c4d208 -> :sswitch_1c
        0x5cb3504 -> :sswitch_1b
        0x697f145 -> :sswitch_1a
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x2ed1a7e8 -> :sswitch_21
        0xc18ff -> :sswitch_20
        0x615e31 -> :sswitch_1f
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch
.end method

.method public onReattachedToActivityForConfigChanges(Ll8/c;)V
    .locals 1

    invoke-interface {p1}, Ll8/c;->e()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lc1/a;->o:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lc1/a;->b(Ll8/c;)V

    return-void
.end method

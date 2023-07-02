.class public final Lg7/c;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/c$b;,
        Lg7/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lg7/c;",
        "Lg7/c$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final ANDROID_APP_INFO_FIELD_NUMBER:I = 0x3

.field public static final APPLICATION_PROCESS_STATE_FIELD_NUMBER:I = 0x5

.field public static final APP_INSTANCE_ID_FIELD_NUMBER:I = 0x2

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:Lg7/c;

.field public static final GOOGLE_APP_ID_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lg7/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private androidAppInfo_:Lg7/a;

.field private appInstanceId_:Ljava/lang/String;

.field private applicationProcessState_:I

.field private bitField0_:I

.field private customAttributes_:Lcom/google/protobuf/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/m0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private googleAppId_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg7/c;

    invoke-direct {v0}, Lg7/c;-><init>()V

    sput-object v0, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    const-class v1, Lg7/c;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    invoke-static {}, Lcom/google/protobuf/m0;->g()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/c;->customAttributes_:Lcom/google/protobuf/m0;

    const-string v0, ""

    iput-object v0, p0, Lg7/c;->googleAppId_:Ljava/lang/String;

    iput-object v0, p0, Lg7/c;->appInstanceId_:Ljava/lang/String;

    return-void
.end method

.method static synthetic R()Lg7/c;
    .locals 1

    sget-object v0, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    return-object v0
.end method

.method static synthetic S(Lg7/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/c;->j0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T(Lg7/c;Lg7/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/c;->i0(Lg7/d;)V

    return-void
.end method

.method static synthetic U(Lg7/c;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lg7/c;->Z()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic V(Lg7/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/c;->h0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W(Lg7/c;Lg7/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/c;->g0(Lg7/a;)V

    return-void
.end method

.method public static Y()Lg7/c;
    .locals 1

    sget-object v0, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    return-object v0
.end method

.method private Z()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lg7/c;->e0()Lcom/google/protobuf/m0;

    move-result-object v0

    return-object v0
.end method

.method private e0()Lcom/google/protobuf/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/m0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg7/c;->customAttributes_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg7/c;->customAttributes_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->q()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/c;->customAttributes_:Lcom/google/protobuf/m0;

    :cond_0
    iget-object v0, p0, Lg7/c;->customAttributes_:Lcom/google/protobuf/m0;

    return-object v0
.end method

.method public static f0()Lg7/c$b;
    .locals 1

    sget-object v0, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lg7/c$b;

    return-object v0
.end method

.method private g0(Lg7/a;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lg7/c;->androidAppInfo_:Lg7/a;

    iget p1, p0, Lg7/c;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lg7/c;->bitField0_:I

    return-void
.end method

.method private h0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/c;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lg7/c;->bitField0_:I

    iput-object p1, p0, Lg7/c;->appInstanceId_:Ljava/lang/String;

    return-void
.end method

.method private i0(Lg7/d;)V
    .locals 0

    invoke-virtual {p1}, Lg7/d;->d()I

    move-result p1

    iput p1, p0, Lg7/c;->applicationProcessState_:I

    iget p1, p0, Lg7/c;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lg7/c;->bitField0_:I

    return-void
.end method

.method private j0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/c;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg7/c;->bitField0_:I

    iput-object p1, p0, Lg7/c;->googleAppId_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lg7/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lg7/c;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lg7/c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lg7/c;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lg7/c;->PARSER:Lcom/google/protobuf/a1;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    return-object p1

    :pswitch_4
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "googleAppId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "appInstanceId_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "androidAppInfo_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "applicationProcessState_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    invoke-static {}, Lg7/d;->g()Lcom/google/protobuf/a0$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "customAttributes_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    sget-object p3, Lg7/c$c;->a:Lcom/google/protobuf/l0;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0005\u100c\u0003\u00062"

    sget-object p3, Lg7/c;->DEFAULT_INSTANCE:Lg7/c;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lg7/c$b;

    invoke-direct {p1, p3}, Lg7/c$b;-><init>(Lg7/c$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lg7/c;

    invoke-direct {p1}, Lg7/c;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public X()Lg7/a;
    .locals 1

    iget-object v0, p0, Lg7/c;->androidAppInfo_:Lg7/a;

    if-nez v0, :cond_0

    invoke-static {}, Lg7/a;->V()Lg7/a;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public a0()Z
    .locals 1

    iget v0, p0, Lg7/c;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b0()Z
    .locals 1

    iget v0, p0, Lg7/c;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c0()Z
    .locals 1

    iget v0, p0, Lg7/c;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d0()Z
    .locals 2

    iget v0, p0, Lg7/c;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

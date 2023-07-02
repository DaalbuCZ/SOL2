.class public final Lg7/g;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lg7/g;",
        "Lg7/g$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final ANDROID_MEMORY_READINGS_FIELD_NUMBER:I = 0x4

.field public static final CPU_METRIC_READINGS_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lg7/g;

.field public static final GAUGE_METADATA_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lg7/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private androidMemoryReadings_:Lcom/google/protobuf/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$i<",
            "Lg7/b;",
            ">;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private cpuMetricReadings_:Lcom/google/protobuf/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$i<",
            "Lg7/e;",
            ">;"
        }
    .end annotation
.end field

.field private gaugeMetadata_:Lg7/f;

.field private sessionId_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg7/g;

    invoke-direct {v0}, Lg7/g;-><init>()V

    sput-object v0, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    const-class v1, Lg7/g;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lg7/g;->sessionId_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/y;->E()Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/g;->cpuMetricReadings_:Lcom/google/protobuf/a0$i;

    invoke-static {}, Lcom/google/protobuf/y;->E()Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/g;->androidMemoryReadings_:Lcom/google/protobuf/a0$i;

    return-void
.end method

.method static synthetic R()Lg7/g;
    .locals 1

    sget-object v0, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    return-object v0
.end method

.method static synthetic S(Lg7/g;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/g;->i0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T(Lg7/g;Lg7/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/g;->W(Lg7/b;)V

    return-void
.end method

.method static synthetic U(Lg7/g;Lg7/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/g;->h0(Lg7/f;)V

    return-void
.end method

.method static synthetic V(Lg7/g;Lg7/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/g;->X(Lg7/e;)V

    return-void
.end method

.method private W(Lg7/b;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lg7/g;->Y()V

    iget-object v0, p0, Lg7/g;->androidMemoryReadings_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private X(Lg7/e;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lg7/g;->Z()V

    iget-object v0, p0, Lg7/g;->cpuMetricReadings_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private Y()V
    .locals 2

    iget-object v0, p0, Lg7/g;->androidMemoryReadings_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Lcom/google/protobuf/a0$i;->B()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/y;->L(Lcom/google/protobuf/a0$i;)Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/g;->androidMemoryReadings_:Lcom/google/protobuf/a0$i;

    :cond_0
    return-void
.end method

.method private Z()V
    .locals 2

    iget-object v0, p0, Lg7/g;->cpuMetricReadings_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Lcom/google/protobuf/a0$i;->B()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/y;->L(Lcom/google/protobuf/a0$i;)Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/g;->cpuMetricReadings_:Lcom/google/protobuf/a0$i;

    :cond_0
    return-void
.end method

.method public static c0()Lg7/g;
    .locals 1

    sget-object v0, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    return-object v0
.end method

.method public static g0()Lg7/g$b;
    .locals 1

    sget-object v0, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lg7/g$b;

    return-object v0
.end method

.method private h0(Lg7/f;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lg7/g;->gaugeMetadata_:Lg7/f;

    iget p1, p0, Lg7/g;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lg7/g;->bitField0_:I

    return-void
.end method

.method private i0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/g;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg7/g;->bitField0_:I

    iput-object p1, p0, Lg7/g;->sessionId_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lg7/g$a;->a:[I

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
    sget-object p1, Lg7/g;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lg7/g;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lg7/g;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lg7/g;->PARSER:Lcom/google/protobuf/a1;

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
    sget-object p1, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "sessionId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "cpuMetricReadings_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lg7/e;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "gaugeMetadata_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "androidMemoryReadings_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-class p3, Lg7/b;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b"

    sget-object p3, Lg7/g;->DEFAULT_INSTANCE:Lg7/g;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lg7/g$b;

    invoke-direct {p1, p3}, Lg7/g$b;-><init>(Lg7/g$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lg7/g;

    invoke-direct {p1}, Lg7/g;-><init>()V

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

.method public a0()I
    .locals 1

    iget-object v0, p0, Lg7/g;->androidMemoryReadings_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public b0()I
    .locals 1

    iget-object v0, p0, Lg7/g;->cpuMetricReadings_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public d0()Lg7/f;
    .locals 1

    iget-object v0, p0, Lg7/g;->gaugeMetadata_:Lg7/f;

    if-nez v0, :cond_0

    invoke-static {}, Lg7/f;->V()Lg7/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public e0()Z
    .locals 1

    iget v0, p0, Lg7/g;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f0()Z
    .locals 2

    iget v0, p0, Lg7/g;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

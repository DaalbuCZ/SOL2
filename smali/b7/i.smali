.class public final Lb7/i;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lb7/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lb7/i;",
        "Lb7/i$b;",
        ">;",
        "Lb7/j;"
    }
.end annotation


# static fields
.field public static final APPLICATION_INFO_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lb7/i;

.field public static final GAUGE_METRIC_FIELD_NUMBER:I = 0x4

.field public static final NETWORK_REQUEST_METRIC_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lb7/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final TRACE_METRIC_FIELD_NUMBER:I = 0x2

.field public static final TRANSPORT_INFO_FIELD_NUMBER:I = 0x5


# instance fields
.field private applicationInfo_:Lb7/c;

.field private bitField0_:I

.field private gaugeMetric_:Lb7/g;

.field private networkRequestMetric_:Lb7/h;

.field private traceMetric_:Lb7/m;

.field private transportInfo_:Lb7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb7/i;

    invoke-direct {v0}, Lb7/i;-><init>()V

    sput-object v0, Lb7/i;->DEFAULT_INSTANCE:Lb7/i;

    const-class v1, Lb7/i;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    return-void
.end method

.method static synthetic R()Lb7/i;
    .locals 1

    sget-object v0, Lb7/i;->DEFAULT_INSTANCE:Lb7/i;

    return-object v0
.end method

.method static synthetic S(Lb7/i;Lb7/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lb7/i;->Z(Lb7/c;)V

    return-void
.end method

.method static synthetic T(Lb7/i;Lb7/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lb7/i;->a0(Lb7/g;)V

    return-void
.end method

.method static synthetic U(Lb7/i;Lb7/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lb7/i;->c0(Lb7/m;)V

    return-void
.end method

.method static synthetic V(Lb7/i;Lb7/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lb7/i;->b0(Lb7/h;)V

    return-void
.end method

.method public static Y()Lb7/i$b;
    .locals 1

    sget-object v0, Lb7/i;->DEFAULT_INSTANCE:Lb7/i;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lb7/i$b;

    return-object v0
.end method

.method private Z(Lb7/c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lb7/i;->applicationInfo_:Lb7/c;

    iget p1, p0, Lb7/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lb7/i;->bitField0_:I

    return-void
.end method

.method private a0(Lb7/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lb7/i;->gaugeMetric_:Lb7/g;

    iget p1, p0, Lb7/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lb7/i;->bitField0_:I

    return-void
.end method

.method private b0(Lb7/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lb7/i;->networkRequestMetric_:Lb7/h;

    iget p1, p0, Lb7/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lb7/i;->bitField0_:I

    return-void
.end method

.method private c0(Lb7/m;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lb7/i;->traceMetric_:Lb7/m;

    iget p1, p0, Lb7/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lb7/i;->bitField0_:I

    return-void
.end method


# virtual methods
.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lb7/i$a;->a:[I

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
    sget-object p1, Lb7/i;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lb7/i;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lb7/i;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lb7/i;->DEFAULT_INSTANCE:Lb7/i;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lb7/i;->PARSER:Lcom/google/protobuf/a1;

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
    sget-object p1, Lb7/i;->DEFAULT_INSTANCE:Lb7/i;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "applicationInfo_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "traceMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "networkRequestMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "gaugeMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "transportInfo_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004"

    sget-object p3, Lb7/i;->DEFAULT_INSTANCE:Lb7/i;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lb7/i$b;

    invoke-direct {p1, p3}, Lb7/i$b;-><init>(Lb7/i$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lb7/i;

    invoke-direct {p1}, Lb7/i;-><init>()V

    return-object p1

    nop

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

.method public W()Lb7/c;
    .locals 1

    iget-object v0, p0, Lb7/i;->applicationInfo_:Lb7/c;

    if-nez v0, :cond_0

    invoke-static {}, Lb7/c;->Y()Lb7/c;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public X()Z
    .locals 2

    iget v0, p0, Lb7/i;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public c()Z
    .locals 1

    iget v0, p0, Lb7/i;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h()Lb7/g;
    .locals 1

    iget-object v0, p0, Lb7/i;->gaugeMetric_:Lb7/g;

    if-nez v0, :cond_0

    invoke-static {}, Lb7/g;->c0()Lb7/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public l()Z
    .locals 1

    iget v0, p0, Lb7/i;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n()Lb7/m;
    .locals 1

    iget-object v0, p0, Lb7/i;->traceMetric_:Lb7/m;

    if-nez v0, :cond_0

    invoke-static {}, Lb7/m;->l0()Lb7/m;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public s()Z
    .locals 1

    iget v0, p0, Lb7/i;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t()Lb7/h;
    .locals 1

    iget-object v0, p0, Lb7/i;->networkRequestMetric_:Lb7/h;

    if-nez v0, :cond_0

    invoke-static {}, Lb7/h;->k0()Lb7/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

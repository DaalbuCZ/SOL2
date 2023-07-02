.class public final Lg7/m;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/m$b;,
        Lg7/m$d;,
        Lg7/m$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lg7/m;",
        "Lg7/m$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final CLIENT_START_TIME_US_FIELD_NUMBER:I = 0x4

.field public static final COUNTERS_FIELD_NUMBER:I = 0x6

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lg7/m;

.field public static final DURATION_US_FIELD_NUMBER:I = 0x5

.field public static final IS_AUTO_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lg7/m;",
            ">;"
        }
    .end annotation
.end field

.field public static final PERF_SESSIONS_FIELD_NUMBER:I = 0x9

.field public static final SUBTRACES_FIELD_NUMBER:I = 0x7


# instance fields
.field private bitField0_:I

.field private clientStartTimeUs_:J

.field private counters_:Lcom/google/protobuf/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/m0<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

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

.field private durationUs_:J

.field private isAuto_:Z

.field private name_:Ljava/lang/String;

.field private perfSessions_:Lcom/google/protobuf/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$i<",
            "Lg7/k;",
            ">;"
        }
    .end annotation
.end field

.field private subtraces_:Lcom/google/protobuf/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$i<",
            "Lg7/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg7/m;

    invoke-direct {v0}, Lg7/m;-><init>()V

    sput-object v0, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    const-class v1, Lg7/m;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    invoke-static {}, Lcom/google/protobuf/m0;->g()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->counters_:Lcom/google/protobuf/m0;

    invoke-static {}, Lcom/google/protobuf/m0;->g()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->customAttributes_:Lcom/google/protobuf/m0;

    const-string v0, ""

    iput-object v0, p0, Lg7/m;->name_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/y;->E()Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->subtraces_:Lcom/google/protobuf/a0$i;

    invoke-static {}, Lcom/google/protobuf/y;->E()Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->perfSessions_:Lcom/google/protobuf/a0$i;

    return-void
.end method

.method private A0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/m;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg7/m;->bitField0_:I

    iput-object p1, p0, Lg7/m;->name_:Ljava/lang/String;

    return-void
.end method

.method static synthetic R()Lg7/m;
    .locals 1

    sget-object v0, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    return-object v0
.end method

.method static synthetic S(Lg7/m;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/m;->A0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T(Lg7/m;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lg7/m;->n0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic U(Lg7/m;Lg7/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/m;->e0(Lg7/m;)V

    return-void
.end method

.method static synthetic V(Lg7/m;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/m;->c0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic W(Lg7/m;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lg7/m;->o0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic X(Lg7/m;Lg7/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/m;->d0(Lg7/k;)V

    return-void
.end method

.method static synthetic Y(Lg7/m;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/m;->b0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic Z(Lg7/m;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/m;->y0(J)V

    return-void
.end method

.method static synthetic a0(Lg7/m;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/m;->z0(J)V

    return-void
.end method

.method private b0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lg7/k;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg7/m;->g0()V

    iget-object v0, p0, Lg7/m;->perfSessions_:Lcom/google/protobuf/a0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private c0(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lg7/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg7/m;->h0()V

    iget-object v0, p0, Lg7/m;->subtraces_:Lcom/google/protobuf/a0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private d0(Lg7/k;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lg7/m;->g0()V

    iget-object v0, p0, Lg7/m;->perfSessions_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private e0(Lg7/m;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lg7/m;->h0()V

    iget-object v0, p0, Lg7/m;->subtraces_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private g0()V
    .locals 2

    iget-object v0, p0, Lg7/m;->perfSessions_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Lcom/google/protobuf/a0$i;->B()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/y;->L(Lcom/google/protobuf/a0$i;)Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->perfSessions_:Lcom/google/protobuf/a0$i;

    :cond_0
    return-void
.end method

.method private h0()V
    .locals 2

    iget-object v0, p0, Lg7/m;->subtraces_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Lcom/google/protobuf/a0$i;->B()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/y;->L(Lcom/google/protobuf/a0$i;)Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->subtraces_:Lcom/google/protobuf/a0$i;

    :cond_0
    return-void
.end method

.method public static l0()Lg7/m;
    .locals 1

    sget-object v0, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    return-object v0
.end method

.method private n0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lg7/m;->v0()Lcom/google/protobuf/m0;

    move-result-object v0

    return-object v0
.end method

.method private o0()Ljava/util/Map;
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

    invoke-direct {p0}, Lg7/m;->w0()Lcom/google/protobuf/m0;

    move-result-object v0

    return-object v0
.end method

.method private t0()Lcom/google/protobuf/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/m0<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg7/m;->counters_:Lcom/google/protobuf/m0;

    return-object v0
.end method

.method private u0()Lcom/google/protobuf/m0;
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

    iget-object v0, p0, Lg7/m;->customAttributes_:Lcom/google/protobuf/m0;

    return-object v0
.end method

.method private v0()Lcom/google/protobuf/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/m0<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg7/m;->counters_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg7/m;->counters_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->q()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->counters_:Lcom/google/protobuf/m0;

    :cond_0
    iget-object v0, p0, Lg7/m;->counters_:Lcom/google/protobuf/m0;

    return-object v0
.end method

.method private w0()Lcom/google/protobuf/m0;
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

    iget-object v0, p0, Lg7/m;->customAttributes_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg7/m;->customAttributes_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->q()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/m;->customAttributes_:Lcom/google/protobuf/m0;

    :cond_0
    iget-object v0, p0, Lg7/m;->customAttributes_:Lcom/google/protobuf/m0;

    return-object v0
.end method

.method public static x0()Lg7/m$b;
    .locals 1

    sget-object v0, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lg7/m$b;

    return-object v0
.end method

.method private y0(J)V
    .locals 1

    iget v0, p0, Lg7/m;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lg7/m;->bitField0_:I

    iput-wide p1, p0, Lg7/m;->clientStartTimeUs_:J

    return-void
.end method

.method private z0(J)V
    .locals 1

    iget v0, p0, Lg7/m;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lg7/m;->bitField0_:I

    iput-wide p1, p0, Lg7/m;->durationUs_:J

    return-void
.end method


# virtual methods
.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-class p2, Lg7/m;

    sget-object p3, Lg7/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object v0

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lg7/m;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    monitor-enter p2

    :try_start_0
    sget-object p1, Lg7/m;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lg7/m;->PARSER:Lcom/google/protobuf/a1;

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
    sget-object p1, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    return-object p1

    :pswitch_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "bitField0_"

    aput-object v1, p1, v0

    const-string v0, "name_"

    aput-object v0, p1, p3

    const/4 p3, 0x2

    const-string v0, "isAuto_"

    aput-object v0, p1, p3

    const/4 p3, 0x3

    const-string v0, "clientStartTimeUs_"

    aput-object v0, p1, p3

    const/4 p3, 0x4

    const-string v0, "durationUs_"

    aput-object v0, p1, p3

    const/4 p3, 0x5

    const-string v0, "counters_"

    aput-object v0, p1, p3

    const/4 p3, 0x6

    sget-object v0, Lg7/m$c;->a:Lcom/google/protobuf/l0;

    aput-object v0, p1, p3

    const/4 p3, 0x7

    const-string v0, "subtraces_"

    aput-object v0, p1, p3

    const/16 p3, 0x8

    aput-object p2, p1, p3

    const/16 p2, 0x9

    const-string p3, "customAttributes_"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    sget-object p3, Lg7/m$d;->a:Lcom/google/protobuf/l0;

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "perfSessions_"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-class p3, Lg7/k;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0008\u0000\u0001\u0001\t\u0008\u0002\u0002\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u00062\u0007\u001b\u00082\t\u001b"

    sget-object p3, Lg7/m;->DEFAULT_INSTANCE:Lg7/m;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lg7/m$b;

    invoke-direct {p1, v0}, Lg7/m$b;-><init>(Lg7/m$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lg7/m;

    invoke-direct {p1}, Lg7/m;-><init>()V

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

.method public f0(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lg7/m;->u0()Lcom/google/protobuf/m0;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public i0()I
    .locals 1

    invoke-direct {p0}, Lg7/m;->t0()Lcom/google/protobuf/m0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    return v0
.end method

.method public j0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lg7/m;->t0()Lcom/google/protobuf/m0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public k0()Ljava/util/Map;
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

    invoke-direct {p0}, Lg7/m;->u0()Lcom/google/protobuf/m0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public m0()J
    .locals 2

    iget-wide v0, p0, Lg7/m;->durationUs_:J

    return-wide v0
.end method

.method public p0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg7/m;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public q0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg7/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg7/m;->perfSessions_:Lcom/google/protobuf/a0$i;

    return-object v0
.end method

.method public r0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg7/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg7/m;->subtraces_:Lcom/google/protobuf/a0$i;

    return-object v0
.end method

.method public s0()Z
    .locals 1

    iget v0, p0, Lg7/m;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.class public final Lg7/h;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/h$b;,
        Lg7/h$c;,
        Lg7/h$e;,
        Lg7/h$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lg7/h;",
        "Lg7/h$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final CLIENT_START_TIME_US_FIELD_NUMBER:I = 0x7

.field public static final CUSTOM_ATTRIBUTES_FIELD_NUMBER:I = 0xc

.field private static final DEFAULT_INSTANCE:Lg7/h;

.field public static final HTTP_METHOD_FIELD_NUMBER:I = 0x2

.field public static final HTTP_RESPONSE_CODE_FIELD_NUMBER:I = 0x5

.field public static final NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:I = 0xb

.field private static volatile PARSER:Lcom/google/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lg7/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final PERF_SESSIONS_FIELD_NUMBER:I = 0xd

.field public static final REQUEST_PAYLOAD_BYTES_FIELD_NUMBER:I = 0x3

.field public static final RESPONSE_CONTENT_TYPE_FIELD_NUMBER:I = 0x6

.field public static final RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER:I = 0x4

.field public static final TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER:I = 0x8

.field public static final TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER:I = 0xa

.field public static final TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER:I = 0x9

.field public static final URL_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private clientStartTimeUs_:J

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

.field private httpMethod_:I

.field private httpResponseCode_:I

.field private networkClientErrorReason_:I

.field private perfSessions_:Lcom/google/protobuf/a0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0$i<",
            "Lg7/k;",
            ">;"
        }
    .end annotation
.end field

.field private requestPayloadBytes_:J

.field private responseContentType_:Ljava/lang/String;

.field private responsePayloadBytes_:J

.field private timeToRequestCompletedUs_:J

.field private timeToResponseCompletedUs_:J

.field private timeToResponseInitiatedUs_:J

.field private url_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg7/h;

    invoke-direct {v0}, Lg7/h;-><init>()V

    sput-object v0, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    const-class v1, Lg7/h;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    invoke-static {}, Lcom/google/protobuf/m0;->g()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/h;->customAttributes_:Lcom/google/protobuf/m0;

    const-string v0, ""

    iput-object v0, p0, Lg7/h;->url_:Ljava/lang/String;

    iput-object v0, p0, Lg7/h;->responseContentType_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/y;->E()Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/h;->perfSessions_:Lcom/google/protobuf/a0$i;

    return-void
.end method

.method private E0()Lcom/google/protobuf/m0;
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

    iget-object v0, p0, Lg7/h;->customAttributes_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lg7/h;->customAttributes_:Lcom/google/protobuf/m0;

    invoke-virtual {v0}, Lcom/google/protobuf/m0;->q()Lcom/google/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Lg7/h;->customAttributes_:Lcom/google/protobuf/m0;

    :cond_0
    iget-object v0, p0, Lg7/h;->customAttributes_:Lcom/google/protobuf/m0;

    return-object v0
.end method

.method public static F0()Lg7/h$b;
    .locals 1

    sget-object v0, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lg7/h$b;

    return-object v0
.end method

.method private G0(J)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-wide p1, p0, Lg7/h;->clientStartTimeUs_:J

    return-void
.end method

.method private H0(Lg7/h$d;)V
    .locals 0

    invoke-virtual {p1}, Lg7/h$d;->d()I

    move-result p1

    iput p1, p0, Lg7/h;->httpMethod_:I

    iget p1, p0, Lg7/h;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lg7/h;->bitField0_:I

    return-void
.end method

.method private I0(I)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lg7/h;->bitField0_:I

    iput p1, p0, Lg7/h;->httpResponseCode_:I

    return-void
.end method

.method private J0(Lg7/h$e;)V
    .locals 0

    invoke-virtual {p1}, Lg7/h$e;->d()I

    move-result p1

    iput p1, p0, Lg7/h;->networkClientErrorReason_:I

    iget p1, p0, Lg7/h;->bitField0_:I

    or-int/lit8 p1, p1, 0x10

    iput p1, p0, Lg7/h;->bitField0_:I

    return-void
.end method

.method private K0(J)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-wide p1, p0, Lg7/h;->requestPayloadBytes_:J

    return-void
.end method

.method private L0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-object p1, p0, Lg7/h;->responseContentType_:Ljava/lang/String;

    return-void
.end method

.method private M0(J)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-wide p1, p0, Lg7/h;->responsePayloadBytes_:J

    return-void
.end method

.method private N0(J)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-wide p1, p0, Lg7/h;->timeToRequestCompletedUs_:J

    return-void
.end method

.method private O0(J)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-wide p1, p0, Lg7/h;->timeToResponseCompletedUs_:J

    return-void
.end method

.method private P0(J)V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit16 v0, v0, 0x200

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-wide p1, p0, Lg7/h;->timeToResponseInitiatedUs_:J

    return-void
.end method

.method private Q0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/h;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg7/h;->bitField0_:I

    iput-object p1, p0, Lg7/h;->url_:Ljava/lang/String;

    return-void
.end method

.method static synthetic R()Lg7/h;
    .locals 1

    sget-object v0, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    return-object v0
.end method

.method static synthetic S(Lg7/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/h;->Q0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T(Lg7/h;Lg7/h$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/h;->J0(Lg7/h$e;)V

    return-void
.end method

.method static synthetic U(Lg7/h;I)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/h;->I0(I)V

    return-void
.end method

.method static synthetic V(Lg7/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/h;->L0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W(Lg7/h;)V
    .locals 0

    invoke-direct {p0}, Lg7/h;->h0()V

    return-void
.end method

.method static synthetic X(Lg7/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/h;->G0(J)V

    return-void
.end method

.method static synthetic Y(Lg7/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/h;->N0(J)V

    return-void
.end method

.method static synthetic Z(Lg7/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/h;->P0(J)V

    return-void
.end method

.method static synthetic a0(Lg7/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/h;->O0(J)V

    return-void
.end method

.method static synthetic b0(Lg7/h;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lg7/h;->n0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c0(Lg7/h;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/h;->g0(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic d0(Lg7/h;Lg7/h$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/h;->H0(Lg7/h$d;)V

    return-void
.end method

.method static synthetic e0(Lg7/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/h;->K0(J)V

    return-void
.end method

.method static synthetic f0(Lg7/h;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg7/h;->M0(J)V

    return-void
.end method

.method private g0(Ljava/lang/Iterable;)V
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

    invoke-direct {p0}, Lg7/h;->i0()V

    iget-object v0, p0, Lg7/h;->perfSessions_:Lcom/google/protobuf/a0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->b(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private h0()V
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lg7/h;->bitField0_:I

    invoke-static {}, Lg7/h;->k0()Lg7/h;

    move-result-object v0

    invoke-virtual {v0}, Lg7/h;->q0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg7/h;->responseContentType_:Ljava/lang/String;

    return-void
.end method

.method private i0()V
    .locals 2

    iget-object v0, p0, Lg7/h;->perfSessions_:Lcom/google/protobuf/a0$i;

    invoke-interface {v0}, Lcom/google/protobuf/a0$i;->B()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/y;->L(Lcom/google/protobuf/a0$i;)Lcom/google/protobuf/a0$i;

    move-result-object v0

    iput-object v0, p0, Lg7/h;->perfSessions_:Lcom/google/protobuf/a0$i;

    :cond_0
    return-void
.end method

.method public static k0()Lg7/h;
    .locals 1

    sget-object v0, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    return-object v0
.end method

.method private n0()Ljava/util/Map;
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

    invoke-direct {p0}, Lg7/h;->E0()Lcom/google/protobuf/m0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public B0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lg7/h$a;->a:[I

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
    sget-object p1, Lg7/h;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lg7/h;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lg7/h;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lg7/h;->PARSER:Lcom/google/protobuf/a1;

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
    sget-object p1, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    return-object p1

    :pswitch_4
    const/16 p1, 0x12

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "url_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "httpMethod_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    invoke-static {}, Lg7/h$d;->g()Lcom/google/protobuf/a0$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "requestPayloadBytes_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "responsePayloadBytes_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "httpResponseCode_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "responseContentType_"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "clientStartTimeUs_"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "timeToRequestCompletedUs_"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "timeToResponseInitiatedUs_"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "timeToResponseCompletedUs_"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "networkClientErrorReason_"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    invoke-static {}, Lg7/h$e;->g()Lcom/google/protobuf/a0$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "customAttributes_"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    sget-object p3, Lg7/h$c;->a:Lcom/google/protobuf/l0;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "perfSessions_"

    aput-object p3, p1, p2

    const/16 p2, 0x11

    const-class p3, Lg7/k;

    aput-object p3, p1, p2

    const-string p2, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1004\u0005\u0006\u1008\u0006\u0007\u1002\u0007\u0008\u1002\u0008\t\u1002\t\n\u1002\n\u000b\u100c\u0004\u000c2\r\u001b"

    sget-object p3, Lg7/h;->DEFAULT_INSTANCE:Lg7/h;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lg7/h$b;

    invoke-direct {p1, p3}, Lg7/h$b;-><init>(Lg7/h$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lg7/h;

    invoke-direct {p1}, Lg7/h;-><init>()V

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

.method public C0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public D0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j0()J
    .locals 2

    iget-wide v0, p0, Lg7/h;->clientStartTimeUs_:J

    return-wide v0
.end method

.method public l0()Lg7/h$d;
    .locals 1

    iget v0, p0, Lg7/h;->httpMethod_:I

    invoke-static {v0}, Lg7/h$d;->e(I)Lg7/h$d;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lg7/h$d;->o:Lg7/h$d;

    :cond_0
    return-object v0
.end method

.method public m0()I
    .locals 1

    iget v0, p0, Lg7/h;->httpResponseCode_:I

    return v0
.end method

.method public o0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg7/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg7/h;->perfSessions_:Lcom/google/protobuf/a0$i;

    return-object v0
.end method

.method public p0()J
    .locals 2

    iget-wide v0, p0, Lg7/h;->requestPayloadBytes_:J

    return-wide v0
.end method

.method public q0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg7/h;->responseContentType_:Ljava/lang/String;

    return-object v0
.end method

.method public r0()J
    .locals 2

    iget-wide v0, p0, Lg7/h;->responsePayloadBytes_:J

    return-wide v0
.end method

.method public s0()J
    .locals 2

    iget-wide v0, p0, Lg7/h;->timeToRequestCompletedUs_:J

    return-wide v0
.end method

.method public t0()J
    .locals 2

    iget-wide v0, p0, Lg7/h;->timeToResponseCompletedUs_:J

    return-wide v0
.end method

.method public u0()J
    .locals 2

    iget-wide v0, p0, Lg7/h;->timeToResponseInitiatedUs_:J

    return-wide v0
.end method

.method public v0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg7/h;->url_:Ljava/lang/String;

    return-object v0
.end method

.method public w0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public x0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z0()Z
    .locals 1

    iget v0, p0, Lg7/h;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

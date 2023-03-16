.class public final Lb7/e;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lb7/e;",
        "Lb7/e$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final CLIENT_TIME_US_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lb7/e;

.field private static volatile PARSER:Lcom/google/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lb7/e;",
            ">;"
        }
    .end annotation
.end field

.field public static final SYSTEM_TIME_US_FIELD_NUMBER:I = 0x3

.field public static final USER_TIME_US_FIELD_NUMBER:I = 0x2


# instance fields
.field private bitField0_:I

.field private clientTimeUs_:J

.field private systemTimeUs_:J

.field private userTimeUs_:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb7/e;

    invoke-direct {v0}, Lb7/e;-><init>()V

    sput-object v0, Lb7/e;->DEFAULT_INSTANCE:Lb7/e;

    const-class v1, Lb7/e;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    return-void
.end method

.method static synthetic R()Lb7/e;
    .locals 1

    sget-object v0, Lb7/e;->DEFAULT_INSTANCE:Lb7/e;

    return-object v0
.end method

.method static synthetic S(Lb7/e;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb7/e;->W(J)V

    return-void
.end method

.method static synthetic T(Lb7/e;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb7/e;->Y(J)V

    return-void
.end method

.method static synthetic U(Lb7/e;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb7/e;->X(J)V

    return-void
.end method

.method public static V()Lb7/e$b;
    .locals 1

    sget-object v0, Lb7/e;->DEFAULT_INSTANCE:Lb7/e;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lb7/e$b;

    return-object v0
.end method

.method private W(J)V
    .locals 1

    iget v0, p0, Lb7/e;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lb7/e;->bitField0_:I

    iput-wide p1, p0, Lb7/e;->clientTimeUs_:J

    return-void
.end method

.method private X(J)V
    .locals 1

    iget v0, p0, Lb7/e;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lb7/e;->bitField0_:I

    iput-wide p1, p0, Lb7/e;->systemTimeUs_:J

    return-void
.end method

.method private Y(J)V
    .locals 1

    iget v0, p0, Lb7/e;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lb7/e;->bitField0_:I

    iput-wide p1, p0, Lb7/e;->userTimeUs_:J

    return-void
.end method


# virtual methods
.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lb7/e$a;->a:[I

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
    sget-object p1, Lb7/e;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lb7/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lb7/e;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lb7/e;->DEFAULT_INSTANCE:Lb7/e;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lb7/e;->PARSER:Lcom/google/protobuf/a1;

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
    sget-object p1, Lb7/e;->DEFAULT_INSTANCE:Lb7/e;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "clientTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "userTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "systemTimeUs_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002"

    sget-object p3, Lb7/e;->DEFAULT_INSTANCE:Lb7/e;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lb7/e$b;

    invoke-direct {p1, p3}, Lb7/e$b;-><init>(Lb7/e$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lb7/e;

    invoke-direct {p1}, Lb7/e;-><init>()V

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

.class public final Lg7/a;
.super Lcom/google/protobuf/y;
.source ""

# interfaces
.implements Lcom/google/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y<",
        "Lg7/a;",
        "Lg7/a$b;",
        ">;",
        "Lcom/google/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lg7/a;

.field public static final PACKAGE_NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a1<",
            "Lg7/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final SDK_VERSION_FIELD_NUMBER:I = 0x2

.field public static final VERSION_NAME_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private packageName_:Ljava/lang/String;

.field private sdkVersion_:Ljava/lang/String;

.field private versionName_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg7/a;

    invoke-direct {v0}, Lg7/a;-><init>()V

    sput-object v0, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    const-class v1, Lg7/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/y;->P(Ljava/lang/Class;Lcom/google/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/y;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lg7/a;->packageName_:Ljava/lang/String;

    iput-object v0, p0, Lg7/a;->sdkVersion_:Ljava/lang/String;

    iput-object v0, p0, Lg7/a;->versionName_:Ljava/lang/String;

    return-void
.end method

.method static synthetic R()Lg7/a;
    .locals 1

    sget-object v0, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    return-object v0
.end method

.method static synthetic S(Lg7/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/a;->Z(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic T(Lg7/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/a;->a0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic U(Lg7/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/a;->b0(Ljava/lang/String;)V

    return-void
.end method

.method public static V()Lg7/a;
    .locals 1

    sget-object v0, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    return-object v0
.end method

.method public static Y()Lg7/a$b;
    .locals 1

    sget-object v0, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    invoke-virtual {v0}, Lcom/google/protobuf/y;->z()Lcom/google/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lg7/a$b;

    return-object v0
.end method

.method private Z(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg7/a;->bitField0_:I

    iput-object p1, p0, Lg7/a;->packageName_:Ljava/lang/String;

    return-void
.end method

.method private a0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lg7/a;->bitField0_:I

    iput-object p1, p0, Lg7/a;->sdkVersion_:Ljava/lang/String;

    return-void
.end method

.method private b0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lg7/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lg7/a;->bitField0_:I

    iput-object p1, p0, Lg7/a;->versionName_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final C(Lcom/google/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lg7/a$a;->a:[I

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
    sget-object p1, Lg7/a;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lg7/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lg7/a;->PARSER:Lcom/google/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/y$b;

    sget-object p3, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/y$b;-><init>(Lcom/google/protobuf/y;)V

    sput-object p1, Lg7/a;->PARSER:Lcom/google/protobuf/a1;

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
    sget-object p1, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "packageName_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "sdkVersion_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "versionName_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002"

    sget-object p3, Lg7/a;->DEFAULT_INSTANCE:Lg7/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/y;->N(Lcom/google/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lg7/a$b;

    invoke-direct {p1, p3}, Lg7/a$b;-><init>(Lg7/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lg7/a;

    invoke-direct {p1}, Lg7/a;-><init>()V

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

.method public W()Z
    .locals 2

    iget v0, p0, Lg7/a;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public X()Z
    .locals 1

    iget v0, p0, Lg7/a;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

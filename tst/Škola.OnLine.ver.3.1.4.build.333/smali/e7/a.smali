.class public final synthetic Le7/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj1/e;


# static fields
.field public static final synthetic a:Le7/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/a;

    invoke-direct {v0}, Le7/a;-><init>()V

    sput-object v0, Le7/a;->a:Le7/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg7/i;

    invoke-virtual {p1}, Lcom/google/protobuf/a;->x()[B

    move-result-object p1

    return-object p1
.end method

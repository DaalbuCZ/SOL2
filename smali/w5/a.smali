.class public final synthetic Lw5/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le1/e;


# static fields
.field public static final synthetic a:Lw5/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw5/a;

    invoke-direct {v0}, Lw5/a;-><init>()V

    sput-object v0, Lw5/a;->a:Lw5/a;

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

    check-cast p1, Ls5/b0;

    invoke-static {p1}, Lw5/b;->a(Ls5/b0;)[B

    move-result-object p1

    return-object p1
.end method

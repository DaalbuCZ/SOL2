.class public final synthetic Lj2/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj2/v$g;


# static fields
.field public static final synthetic a:Lj2/t;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj2/t;

    invoke-direct {v0}, Lj2/t;-><init>()V

    sput-object v0, Lj2/t;->a:Lj2/t;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj2/n;

    invoke-static {p1}, Lj2/v;->b(Lj2/n;)I

    move-result p1

    return p1
.end method
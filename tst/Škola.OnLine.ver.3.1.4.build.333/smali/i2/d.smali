.class public final synthetic Li2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/r;


# static fields
.field public static final synthetic b:Li2/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/d;

    invoke-direct {v0}, Li2/d;-><init>()V

    sput-object v0, Li2/d;->b:Li2/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()[Lc2/l;
    .locals 1

    invoke-static {}, Li2/e;->d()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Landroid/net/Uri;Ljava/util/Map;)[Lc2/l;
    .locals 0

    invoke-static {p0, p1, p2}, Lc2/q;->a(Lc2/r;Landroid/net/Uri;Ljava/util/Map;)[Lc2/l;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Ld2/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/r;


# static fields
.field public static final synthetic b:Ld2/d;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ld2/d;

    invoke-direct {v0}, Ld2/d;-><init>()V

    sput-object v0, Ld2/d;->b:Ld2/d;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()[Lx1/l;
    .locals 1

    invoke-static {}, Ld2/e;->d()[Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Landroid/net/Uri;Ljava/util/Map;)[Lx1/l;
    .locals 0

    invoke-static {p0, p1, p2}, Lx1/q;->a(Lx1/r;Landroid/net/Uri;Ljava/util/Map;)[Lx1/l;

    move-result-object p1

    return-object p1
.end method

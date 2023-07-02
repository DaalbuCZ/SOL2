.class public final synthetic Lj6/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/d;


# static fields
.field public static final synthetic a:Lj6/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj6/e;

    invoke-direct {v0}, Lj6/e;-><init>()V

    sput-object v0, Lj6/e;->a:Lj6/e;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Lg6/e;

    invoke-static {p1, p2}, Lj6/f;->b(Ljava/util/Map$Entry;Lg6/e;)V

    return-void
.end method

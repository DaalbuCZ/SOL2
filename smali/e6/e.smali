.class public final synthetic Le6/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# static fields
.field public static final synthetic a:Le6/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Le6/e;

    invoke-direct {v0}, Le6/e;-><init>()V

    sput-object v0, Le6/e;->a:Le6/e;

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

    check-cast p2, Lb6/e;

    invoke-static {p1, p2}, Le6/f;->d(Ljava/util/Map$Entry;Lb6/e;)V

    return-void
.end method

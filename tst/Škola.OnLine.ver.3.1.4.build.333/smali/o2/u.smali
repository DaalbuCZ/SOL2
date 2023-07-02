.class public final synthetic Lo2/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo2/v$g;


# static fields
.field public static final synthetic a:Lo2/u;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo2/u;

    invoke-direct {v0}, Lo2/u;-><init>()V

    sput-object v0, Lo2/u;->a:Lo2/u;

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

    check-cast p1, Lo2/n;

    invoke-static {p1}, Lo2/v;->b(Lo2/n;)I

    move-result p1

    return p1
.end method

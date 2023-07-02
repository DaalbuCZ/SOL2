.class public final synthetic Lo2/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo2/q;


# static fields
.field public static final synthetic b:Lo2/p;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo2/p;

    invoke-direct {v0}, Lo2/p;-><init>()V

    sput-object v0, Lo2/p;->b:Lo2/p;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 0

    invoke-static {p1, p2, p3}, Lo2/v;->s(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

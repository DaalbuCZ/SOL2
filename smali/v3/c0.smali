.class public final synthetic Lv3/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/h;


# static fields
.field public static final synthetic a:Lv3/c0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lv3/c0;

    invoke-direct {v0}, Lv3/c0;-><init>()V

    sput-object v0, Lv3/c0;->a:Lv3/c0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lt4/i;
    .locals 0

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p1}, Lv3/d;->b(Landroid/os/Bundle;)Lt4/i;

    move-result-object p1

    return-object p1
.end method

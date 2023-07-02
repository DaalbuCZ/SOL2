.class public final synthetic La4/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/h;


# static fields
.field public static final synthetic a:La4/c0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, La4/c0;

    invoke-direct {v0}, La4/c0;-><init>()V

    sput-object v0, La4/c0;->a:La4/c0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ly4/i;
    .locals 0

    check-cast p1, Landroid/os/Bundle;

    invoke-static {p1}, La4/d;->b(Landroid/os/Bundle;)Ly4/i;

    move-result-object p1

    return-object p1
.end method

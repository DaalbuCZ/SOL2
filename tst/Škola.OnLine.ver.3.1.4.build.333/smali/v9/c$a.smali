.class public final Lv9/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Lv9/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lv9/c;
    .locals 1

    invoke-static {}, Lv9/c;->l()Lv9/c;

    move-result-object v0

    return-object v0
.end method

.class public final Ln9/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln9/c;
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

.method public synthetic constructor <init>(Lk9/g;)V
    .locals 0

    invoke-direct {p0}, Ln9/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ln9/c;
    .locals 1

    invoke-static {}, Ln9/c;->l()Ln9/c;

    move-result-object v0

    return-object v0
.end method

.class final Ll1/k$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Ll1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll1/k;

    invoke-direct {v0}, Ll1/k;-><init>()V

    sput-object v0, Ll1/k$a;->a:Ll1/k;

    return-void
.end method

.method static synthetic a()Ll1/k;
    .locals 1

    sget-object v0, Ll1/k$a;->a:Ll1/k;

    return-object v0
.end method

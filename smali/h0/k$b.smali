.class Lh0/k$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static final a:Lh0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lh0/k;->a()Lh0/l;

    move-result-object v0

    sput-object v0, Lh0/k$b;->a:Lh0/l;

    return-void
.end method

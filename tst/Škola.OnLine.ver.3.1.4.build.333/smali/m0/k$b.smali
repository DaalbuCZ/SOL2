.class Lm0/k$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field static final a:Lm0/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lm0/k;->a()Lm0/l;

    move-result-object v0

    sput-object v0, Lm0/k$b;->a:Lm0/l;

    return-void
.end method

.class Lh0/k$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lh0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh0/n;

    invoke-static {}, Lh0/k;->d()Lh0/l;

    move-result-object v1

    invoke-interface {v1}, Lh0/l;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    move-result-object v1

    invoke-direct {v0, v1}, Lh0/n;-><init>(Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;)V

    sput-object v0, Lh0/k$a;->a:Lh0/n;

    return-void
.end method

.class public Landroidx/lifecycle/b0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/b0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/b0$c$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/b0$c$a;

.field public static final c:Ly/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly/a$b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/b0$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/b0$c$a;-><init>(Ls9/g;)V

    sput-object v0, Landroidx/lifecycle/b0$c;->b:Landroidx/lifecycle/b0$c$a;

    sget-object v0, Landroidx/lifecycle/b0$c$a$a;->a:Landroidx/lifecycle/b0$c$a$a;

    sput-object v0, Landroidx/lifecycle/b0$c;->c:Ly/a$b;

    return-void
.end method
